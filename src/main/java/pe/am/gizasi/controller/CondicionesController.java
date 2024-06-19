package pe.am.gizasi.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.am.gizasi.model.Condiciones;
import pe.am.gizasi.model.Response;
import pe.am.gizasi.services.CondicionesService;
import java.util.List;

@RestController
@RequestMapping("/api/condiciones")
public class CondicionesController {

    private final CondicionesService condicionesService;

    @Autowired
    public CondicionesController(CondicionesService condicionesService) {
        this.condicionesService = condicionesService;
    }

    @GetMapping
    public ResponseEntity<Response<List<Condiciones>>> listarCondiciones() {
        try {
            List<Condiciones> condiciones = condicionesService.getAllCondicones();
            return ResponseEntity.ok(new Response<>("success", "Lista de condiciones obtenida con éxito", condiciones, HttpStatus.OK.value()));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new Response<>("fail", "Error al obtener la lista de condiciones", null, HttpStatus.INTERNAL_SERVER_ERROR.value()));
        }
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Response<String>> handleException(Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(new Response<>("fail", "Ocurrió un error: " + e.getMessage(), null, HttpStatus.INTERNAL_SERVER_ERROR.value()));
    }
}
