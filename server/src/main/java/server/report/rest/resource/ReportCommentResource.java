package server.report.rest.resource;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ReportCommentResource {

    private Long id;

    private String commentingUser;

    private String comment;

    private LocalDateTime createdAt;
}
