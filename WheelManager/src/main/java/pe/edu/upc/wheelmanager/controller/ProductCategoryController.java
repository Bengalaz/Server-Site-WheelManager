package pe.edu.upc.wheelmanager.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.modelmapper.ModelMapper;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.wheelmanager.domain.model.ProductCategory;
import pe.edu.upc.wheelmanager.domain.service.ProductCategoryService;
import pe.edu.upc.wheelmanager.resource.ProductCategoryResource;
import pe.edu.upc.wheelmanager.resource.SaveProductCategoryResource;


import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@Tag(name = "ProductsCategories", description = "ProductCategory API")
@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductCategoryController {
    @Autowired
    ProductCategoryService productCategoryService;
    @Autowired
    private ModelMapper mapper;

    @GetMapping(value = "/productsCategories")
    public Page<ProductCategoryResource> getAllProductsCategories(@ParameterObject Pageable pageable) {
        Page<ProductCategory> corporationPage = productCategoryService.getAllProductCategory(pageable);
        List<ProductCategoryResource> resources = corporationPage.getContent()
                .stream().map(this::convertToResource)
                .collect(Collectors.toList());
        return new PageImpl<>(resources, pageable, resources.size());
    }

    @GetMapping("/productsCategories/{productCategoryId}")
    public ProductCategoryResource getProductCategoryById(@PathVariable(value = "productCategoryId") Long productCategoryId) {
        return convertToResource(productCategoryService.getProductCategoryById(productCategoryId));
    }

    @PostMapping("/productsCategories")
    public ProductCategoryResource createProductCategory(@Valid @RequestBody SaveProductCategoryResource resource) {
        ProductCategory productCategory = convertToEntity(resource);
        return convertToResource(productCategoryService.createProductCategory(productCategory));
    }

    @PutMapping("/productsCategories/{productCategoryId}")
    public ProductCategoryResource updateProductCategory(@PathVariable Long productCategoryId, @Valid @RequestBody SaveProductCategoryResource resource) {
        ProductCategory productCategory = convertToEntity(resource);
        return convertToResource(productCategoryService.updateProductCategory(productCategoryId, productCategory));
    }

    @DeleteMapping("/productsCategories/{productCategoryId}")
    public ResponseEntity<?> deleteProductCategory(@PathVariable Long corporationId) {
        return productCategoryService.deleteProductCategory(corporationId);
    }

    private ProductCategory convertToEntity(SaveProductCategoryResource resource) {
        return mapper.map(resource, ProductCategory.class);
    }

    private ProductCategoryResource convertToResource(ProductCategory entity) {
        return mapper.map(entity, ProductCategoryResource.class);
    }

}
