package server.exception;

import server.user.entity.RoleType;

public class InvalidRoleException extends Throwable {
    public InvalidRoleException() {

        super("Invalid role");
    }
}
