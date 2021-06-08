package pe.edu.upc.wheelmanager.resource;
import lombok.Getter;
import lombok.Setter;
import pe.edu.upc.wheelmanager.domain.model.AuditModel;


@Getter
@Setter
public class CorporationResource extends AuditModel{
    private Long id;
    private int ruc;
    private String name;
    private String address;
    private String phone;
}
