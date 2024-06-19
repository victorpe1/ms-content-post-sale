package pe.am.gizasi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.am.gizasi.model.Product;
import pe.am.gizasi.model.Response;
import pe.am.gizasi.services.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productosService) {
        this.productService = productosService;
    }
    @GetMapping
    public ResponseEntity<Response<List<Product>>> listarProductos() {
        try {
            List<Product> productos = productService.getAllProducts();
            return ResponseEntity.ok(new Response<>("success", "Lista de productos obtenida con éxito", productos, HttpStatus.OK.value()));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new Response<>("fail", "Error al obtener la lista de productos", null, HttpStatus.INTERNAL_SERVER_ERROR.value()));
        }
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Response<String>> handleException(Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(new Response<>("fail", "Ocurrió un error: " + e.getMessage(), null, HttpStatus.INTERNAL_SERVER_ERROR.value()));
    }
}