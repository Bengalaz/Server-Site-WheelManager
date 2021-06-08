package pe.edu.upc.wheelmanager.resource;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SaveUserProfileResource {
    @NotNull
    @Size(max = 30)
    private String name;

    @NotNull
    @Size(max = 30)
    private String last_name;

    @Size(max = 30)
    private String gender;
}
