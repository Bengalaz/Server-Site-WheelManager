package pe.edu.upc.wheelmanager.domain.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "services")
@Getter
@Setter
public class CorporationService extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    @Size(max = 30)
    @Column(unique = true)
    private String category;

    @NotNull
    @Size(max = 20)
    @Column(unique = true)
    private  Double price;

    @Size(max = 200)
    private String picture;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "corporation_id",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Corporation corporation;
}
