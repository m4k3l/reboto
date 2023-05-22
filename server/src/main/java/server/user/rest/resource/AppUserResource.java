package server.user.rest.resource;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AppUserResource {

    private Long id;

    private String role;

    private String organizationalUnit;

    private String firstName;

    private String lastName;

    private String emailAddress;

    private String signature;
}
