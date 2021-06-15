package pe.edu.upc.wheelmanager.resource;

import lombok.Getter;
import lombok.Setter;
import pe.edu.upc.wheelmanager.domain.model.AuditModel;

@Getter
@Setter
public class ProductCategoryResource extends AuditModel {
    private Long id;
    private String name;
    private String picture;
}
