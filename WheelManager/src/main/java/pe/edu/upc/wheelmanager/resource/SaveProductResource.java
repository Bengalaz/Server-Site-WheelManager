package pe.edu.upc.wheelmanager.resource;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class SaveProductResource {

    @Column(unique = true)
    private int rating;

    @Column(unique = true)
    private int units_int_stock;

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
