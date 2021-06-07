package pe.edu.upc.wheelmanager.resource;
import lombok.Getter;
import lombok.Setter;
import pe.edu.upc.wheelmanager.domain.model.AuditModel;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class CorporationResource extends AuditModel{
    private Long id;
    private int ruc;
    private String name;
    private String address;
    private String phone;
}
