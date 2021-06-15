package pe.edu.upc.wheelmanager.resource;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import pe.edu.upc.wheelmanager.domain.model.Corporation;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class SaveCorporationServiceResource {
    @Column(unique = true)
    private int rating;

    @NotNull
    @Size(max = 50)
    @Column(unique = true)
    private String name;

    @NotNull
    @Lob
    private String description;


    @NotNull
    private  Double price;

    @NotNull
    @Lob
    private String picture;
}
