package server.exception;

public class InvalidOrgUnitException extends Throwable{

    public InvalidOrgUnitException() {
        super("Invalid OrgUnit type");
    }
}
