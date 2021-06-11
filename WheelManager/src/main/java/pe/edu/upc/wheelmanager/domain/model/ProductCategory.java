package pe.edu.upc.wheelmanager.domain.model;

import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "products_categories")
@Getter
@Setter
public class ProductCategory extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 210)
    @Column(unique = true)
    private String name;

    @NotNull
    @Size(max = 210)
    private String picture;
}
