package server.exception;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class ReportAlreadyExistsException extends Throwable {
    public ReportAlreadyExistsException(@NotNull LocalDate fromDate) {

        super("Report for date: " + fromDate.toString() + " already exists");
    }
}
