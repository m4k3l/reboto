package server.exception;

public class UserAlreadyExistsException extends Throwable {

    public UserAlreadyExistsException() {
        super("User already exists");
    }
}
