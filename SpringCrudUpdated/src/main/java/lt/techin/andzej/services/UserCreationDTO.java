package lt.techin.andzej.services;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreationDTO {
    private String username;
    private String firstName;
    private String lastName;
    private String email;
}
