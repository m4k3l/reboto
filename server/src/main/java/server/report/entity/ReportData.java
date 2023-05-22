package server.report.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import server.user.entity.AppUser;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static jakarta.persistence.EnumType.STRING;
import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
public class ReportData {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "author_id")
    private AppUser author;

    @NotNull
    private LocalDate fromDate;

    @NotNull
    @Enumerated(STRING)
    private Department department;

    @NotNull
    private Short trainingYear;

    @NotNull
    private boolean isApproved;

    private String workText;

    private String externalText;

    private String schoolText;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
