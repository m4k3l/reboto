package server.report.rest.resource;

import lombok.Getter;
import lombok.Setter;
import server.user.rest.resource.AppUserResource;

import java.time.LocalDateTime;

@Getter
@Setter
public class NotificationHistoryResource {

    private ReportDataResource report;

    private AppUserResource recipient;

    private LocalDateTime sentAt;
}
