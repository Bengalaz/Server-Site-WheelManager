package pe.edu.upc.wheelmanager.resource;

import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import javax.persistence.Column;
import javax.validation.constraints.Size;

@Getter
@Setter
public class SaveProductCategoryResource {

    @NotNull
    @Size(max = 210)
    @Column(unique = true)
    private String name;

    @NotNull
    @Size(max = 210)
    private String picture;
}
