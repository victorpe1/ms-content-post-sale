package pe.am.gizasi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.am.gizasi.dto.OrderRequest;
import pe.am.gizasi.model.Response;
import pe.am.gizasi.services.OrderService;
import pe.am.gizasi.util.OrderRequestTimeException;

@RestController
@RequestMapping("/api/order")
public class OrderController {

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
