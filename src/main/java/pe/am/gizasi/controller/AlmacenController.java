package pe.am.gizasi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.am.gizasi.model.Almacen;
import pe.am.gizasi.model.Response;
import pe.am.gizasi.services.AlmacenService;

import java.util.List;

@RestController
@RequestMapping("/api/almacenes")
public class AlmacenController {

    private AlmacenService almacenService;

    @Autowired
    public AlmacenController(AlmacenService almacenService) {
        this.almacenService = almacenService;
    }
    @GetMapping
    public ResponseEntity<Response<List<Almacen>>> listarAlmacenes() {
        try {
            List<Almacen> almacenes = almacenService.getAllAlmacens();
            return ResponseEntity.ok(new Response<>("success", "Lista de almacenes obtenida con éxito", almacenes, HttpStatus.OK.value()));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new Response<>("fail", "Error al obtener la lista de almacenes", null, HttpStatus.INTERNAL_SERVER_ERROR.value()));
        }
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Response<String>> handleException(Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(new Response<>("fail", "Ocurrió un error: " + e.getMessage(), null, HttpStatus.INTERNAL_SERVER_ERROR.value()));
    }
}