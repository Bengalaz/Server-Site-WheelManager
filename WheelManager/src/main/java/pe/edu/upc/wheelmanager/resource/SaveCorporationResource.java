package pe.edu.upc.wheelmanager.resource;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class SaveCorporationResource {
    @NotNull
    @Column(unique = true)
    private int ruc;

    @NotNull
    @Size(max = 25)
    private String name;

    @NotNull
    @Size(max = 30)
    @Column(unique = true)
    private String address;

    @NotNull
    @Size(max = 20)
    @Column(unique = true)
    private String phone;
}
