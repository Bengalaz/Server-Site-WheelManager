package pe.edu.upc.wheelmanager.domain.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.jetbrains.annotations.NotNull;
import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 30)
    @Column(unique = true)
    private String username;

    @NotNull
    @Size(max = 25)
    private String password;

    @NotNull
    @Size(max = 100)
    @Column(unique = true)
    private String email;

    private boolean isBusinessman;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "user_profile_id",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private UserProfile userProfile;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "corporation_id",nullable = true)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Corporation corporation;

    public boolean getIsbusinessman(){ return isBusinessman; }
}
