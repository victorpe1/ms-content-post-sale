package pe.am.gizasi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.am.gizasi.model.Response;
import pe.am.gizasi.model.Tcambio;
import pe.am.gizasi.services.TcambioService;
import java.util.List;

@RestController
@RequestMapping("/api/tcambio")
public class TcambioController {

    private final TcambioService tcambioService;

    @Autowired
    public TcambioController(TcambioService tcambioService) {
        this.tcambioService = tcambioService;
    }

    @GetMapping
    public ResponseEntity<Response<List<Tcambio>>> listarTcambios() {
        try {
            List<Tcambio> tcambios = tcambioService.getAllTcambios();
            return ResponseEntity.ok(new Response<>("success", "Lista de tipos de cambios obtenida con éxito", tcambios, HttpStatus.OK.value()));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new Response<>("fail", "Error al obtener la lista de clientes", null, HttpStatus.INTERNAL_SERVER_ERROR.value()));
        }
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Response<String>> handleException(Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(new Response<>("fail", "Ocurrió un error: " + e.getMessage(), null, HttpStatus.INTERNAL_SERVER_ERROR.value()));
    }
}
