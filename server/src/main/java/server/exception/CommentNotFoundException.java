package server.exception;

public class CommentNotFoundException extends Throwable {

    public CommentNotFoundException() {
        super("Comment not found");
    }
}
