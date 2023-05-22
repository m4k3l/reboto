package server.exception;

public class UserNotFoundException extends Throwable {

    public UserNotFoundException() {
        super("User not found");
    }
}
