package server.report.rest.resource;

import lombok.Getter;
import lombok.Setter;
import server.user.rest.resource.AppUserResource;

import java.time.LocalDateTime;

@Getter
@Setter
public class ReportCommentResource {

    private Long id;

    private AppUserResource commentingUser;

    private String comment;

    private LocalDateTime createdAt;

    private ReportDataResource commentedReport;
}
