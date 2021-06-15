package pe.edu.upc.wheelmanager.resource;

import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import javax.persistence.Column;
import javax.persistence.Lob;
import javax.validation.constraints.Size;

@Getter
@Setter
public class SaveProductCategoryResource {

    @NotNull
    @Size(max = 210)
    @Column(unique = true)
    private String name;

    @Lob
    @Column(name = "picture", nullable = false)
    private String picture;
}
