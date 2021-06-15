package pe.edu.upc.wheelmanager.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.wheelmanager.domain.model.ProductCategory;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Long> {
}
