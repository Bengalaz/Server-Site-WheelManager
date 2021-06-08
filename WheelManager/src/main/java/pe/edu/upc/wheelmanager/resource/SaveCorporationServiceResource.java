package pe.edu.upc.wheelmanager.resource;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import pe.edu.upc.wheelmanager.domain.model.Corporation;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SaveCorporationServiceResource {
    @Column(unique = true)
    private int rating;

    @NotNull
    @Size(max = 25)
    @Column(unique = true)
    private String name;

    @NotNull
    @Size(max = 30)
    @Column(unique = true)
    private String description;


    @NotNull
    @Size(max = 20)
    @Column(unique = true)
    private  Double price;

    @Size(max = 200)
    private String picture;
}
