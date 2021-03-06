package pe.edu.upc.wheelmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import pe.edu.upc.wheelmanager.domain.model.Product;
import pe.edu.upc.wheelmanager.domain.repository.CorporationRepository;
import pe.edu.upc.wheelmanager.domain.repository.ProductCategoryRepository;
import pe.edu.upc.wheelmanager.domain.repository.ProductRepository;
import org.springframework.data.domain.Pageable;
import pe.edu.upc.wheelmanager.domain.service.ProductService;
import pe.edu.upc.wheelmanager.exception.ResourceNotFoundException;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CorporationRepository corporationRepository;

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public Product createProduct(Long corporationId, Long productCategoryId, Product product)
    {
        return productCategoryRepository.findById(productCategoryId).map( productCategory -> {
            product.setProductCategory(productCategory);
        return corporationRepository.findById(corporationId).map(corporation -> {
            product.setCorporation(corporation);
            return productRepository.save(product);
        }).orElseThrow(()->new ResourceNotFoundException("Corporation","Id",corporationId));
    }).orElseThrow(()->new ResourceNotFoundException("ProductCategory","Id",productCategoryId));
    }

    @Override
    public Product updateProduct(Long productId, Product productRequest){
        return productRepository.findById(productId).map(product -> {
            product.setRating(productRequest.getRating());
            product.setUnits_int_stock(productRequest.getUnits_int_stock());
            product.setName(productRequest.getName());
            product.setDescription(productRequest.getDescription());
            product.setPrice(productRequest.getPrice());
            product.setPicture(productRequest.getPicture());
            return productRepository.save(product);
        }).orElseThrow(()->new ResourceNotFoundException("Product","Id",productId));
    }

    @Override
    public ResponseEntity<?> deleteProduct(Long productId){
        return productRepository.findById(productId).map(product -> {
            productRepository.delete(product);
            return ResponseEntity.ok().build();
        }).orElseThrow(()->new ResourceNotFoundException("Product","Id",productId));
    }

    @Override
    public Page<Product> getAllProducts(Pageable pageable){
        return productRepository.findAll(pageable);
    }

    @Override
    public Product getProductById(Long productId){
        return productRepository.findById(productId)
                .orElseThrow(() -> new ResourceNotFoundException("Product", "Id", productId));
    }
}
