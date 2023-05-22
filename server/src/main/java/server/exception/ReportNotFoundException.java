package server.exception;

public class ReportNotFoundException extends Throwable {

    public ReportNotFoundException() {
        super("Report not found!");
    }
}
