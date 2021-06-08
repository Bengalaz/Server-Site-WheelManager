package pe.edu.upc.wheelmanager.resource;

import lombok.Getter;
import lombok.Setter;
import pe.edu.upc.wheelmanager.domain.model.AuditModel;
import pe.edu.upc.wheelmanager.domain.model.Corporation;


@Getter
@Setter
public class ProductResource extends AuditModel {
    private Long id;
    private int rating;
    private int units_int_stock;
    private String name;
    private String description;
    private String category;
    private  Double price;
    private String picture;
    private Corporation corporation;
}
