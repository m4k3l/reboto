package server.report.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import server.user.entity.AppUser;

import java.time.Instant;
import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
public class ReportComment {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "report_id")
    private ReportData commentedReport;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "user_id")
    private AppUser commentingUser;

    @NotNull
    private String comment;

    @NotNull
    private LocalDateTime createdAt;
}
