package pe.edu.upc.wheelmanager.domain.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "corporations")
@Getter
@Setter
public class Corporation extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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
