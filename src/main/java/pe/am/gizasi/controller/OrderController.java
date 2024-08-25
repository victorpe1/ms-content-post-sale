package pe.am.gizasi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.am.gizasi.dto.OrderRequest;
import pe.am.gizasi.model.OrdenPedido;
import pe.am.gizasi.model.Personal;
import pe.am.gizasi.model.Response;
import pe.am.gizasi.services.OrderService;
import pe.am.gizasi.util.OrderRequestTimeException;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

@RestController
@RequestMapping("/api/order")
public class OrderController {

  private static final String DATE_PATTERN = "^\\d{4}-\\d{2}-\\d{2}$"; // Expresión regular para yyyy-MM-dd
  private static final Pattern DATE_REGEX = Pattern.compile(DATE_PATTERN);

  @Autowired
  private OrderService orderService;

  @PostMapping("/save")
  public ResponseEntity<Response<String>> guardarPedido(@RequestBody OrderRequest ordenPedido) {
    Response<String> response = new Response<>();

    try {
      String idNumeroPedido = orderService.saveOrderPedido(ordenPedido);

      response.setData("Pedido guardado con éxito con el ID: " + idNumeroPedido);
      response.setStatus("success");
      response.setMessage("El pedido ha sido registrado exitosamente.");
      response.setCode(HttpStatus.CREATED.value());
      return new ResponseEntity<>(response, HttpStatus.CREATED);
    } catch (OrderRequestTimeException e) {
      response.setData(null);
      response.setStatus("error");
      response.setMessage(e.getMessage());
      response.setCode(HttpStatus.BAD_REQUEST.value());
      return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    } catch (Exception e) {
      response.setData(null);
      response.setStatus("error");
      response.setMessage(e.getMessage());
      response.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
      return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @GetMapping
  public ResponseEntity<Response<List<OrdenPedido>>> listarPedidos(@RequestParam("fecha") String fecha) {

    if (!isValidDateFormat(fecha)) {
      return ResponseEntity.badRequest().body(new Response<>("fail",
          "Fecha inválida. El formato correcto es yyyy-MM-dd.", null, HttpStatus.BAD_REQUEST.value()));
    }

    try {
      List<OrdenPedido> pedidos = orderService.getPedidosByFecha(fecha);

      return ResponseEntity.ok(new Response<>("success", "Lista de pedidos obtenida con éxito", pedidos,
          HttpStatus.OK.value()));
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
          .body(new Response<>("fail", "Error al obtener la lista de pedidos", null,
              HttpStatus.INTERNAL_SERVER_ERROR.value()));
    }
  }

  private boolean isValidDateFormat(String fecha) {
    return DATE_REGEX.matcher(fecha).matches();
  }

  @ExceptionHandler(Exception.class)
  public ResponseEntity<Response<String>> handleException(Exception e) {
    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
        .body(new Response<>("fail", "Ocurrió un error: " + e.getMessage(), null,
            HttpStatus.INTERNAL_SERVER_ERROR.value()));
  }

  @ExceptionHandler(OrderRequestTimeException.class)
  public ResponseEntity<Response<String>> handleOrderRequestTimeException(OrderRequestTimeException e) {
    Response<String> response = new Response<>();
    response.setData(null);
    response.setStatus("error");
    response.setMessage(e.getMessage());
    response.setCode(HttpStatus.BAD_REQUEST.value());
    return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
  }
}
