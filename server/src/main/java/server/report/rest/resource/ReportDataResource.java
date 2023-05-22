package server.report.rest.resource;

import lombok.Getter;
import lombok.Setter;
import server.user.rest.resource.AppUserResource;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class ReportDataResource {

    private Long id;

    private AppUserResource author;

    private LocalDate fromDate;

    private LocalDate toDate;

    private String department;

    private Short trainingYear;

    private boolean isApproved;

    private String workText;

    private String externalText;

    private String schoolText;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
