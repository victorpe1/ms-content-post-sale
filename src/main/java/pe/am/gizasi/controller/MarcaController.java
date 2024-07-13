package pe.am.gizasi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.am.gizasi.model.Distrito;
import pe.am.gizasi.model.Marca;
import pe.am.gizasi.model.Response;
import pe.am.gizasi.services.DistritoService;
import pe.am.gizasi.services.MarcaService;

import java.util.List;

@RestController
@RequestMapping("/api/marca")
public class MarcaController {

  private final MarcaService marcaService;

  @Autowired
  public MarcaController(MarcaService marcaService) {
    this.marcaService = marcaService;
  }

  @GetMapping
  public ResponseEntity<Response<List<Marca>>> listarMarcas() {
    try {
      List<Marca> marcaList = marcaService.getAllMarcas();
      return ResponseEntity.ok(new Response<>("success", "Lista de marcas obtenida con éxito", marcaList, HttpStatus.OK.value()));
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
          .body(new Response<>("fail", "Error al obtener la lista de marcas", null, HttpStatus.INTERNAL_SERVER_ERROR.value()));
    }
  }

  @ExceptionHandler(Exception.class)
  public ResponseEntity<Response<String>> handleException(Exception e) {
    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
        .body(new Response<>("fail", "Ocurrió un error: " + e.getMessage(), null, HttpStatus.INTERNAL_SERVER_ERROR.value()));
  }
}
