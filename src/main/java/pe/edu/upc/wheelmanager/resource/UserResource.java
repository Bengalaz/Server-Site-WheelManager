package pe.edu.upc.wheelmanager.resource;
import lombok.Getter;
import lombok.Setter;
import pe.edu.upc.wheelmanager.domain.model.AuditModel;
import pe.edu.upc.wheelmanager.domain.model.Corporation;
import pe.edu.upc.wheelmanager.domain.model.UserProfile;

@Getter
@Setter
public class UserResource extends AuditModel {
    private Long id;
    private String username;
    private String password;
    private String email;
    private boolean isBusinessman;
    private UserProfile userProfile;
    private Corporation corporation;
}
