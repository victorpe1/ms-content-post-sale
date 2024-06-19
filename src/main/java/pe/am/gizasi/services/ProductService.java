package pe.am.gizasi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.am.gizasi.model.Product;
import pe.am.gizasi.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository clientRepository) {
        this.productRepository = clientRepository;
    }

    public List<Product> getAllProducts() {
        List<Product> productos = productRepository.findAll();
        if (productos.isEmpty()) {
            throw new RuntimeException("No hay productos disponibles");
        }
        return productos;
    }
}