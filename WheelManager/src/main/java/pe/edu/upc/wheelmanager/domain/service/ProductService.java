package pe.edu.upc.wheelmanager.domain.service;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import pe.edu.upc.wheelmanager.domain.model.Product;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    Product createProduct(Product product);
    Product updateProduct(Long productId, Product productRequest);
    ResponseEntity<?> deleteProduct(Long productId);
    Page<Product> getAllProducts(Pageable pageable);
    Product getProductById(Long productId);
}
