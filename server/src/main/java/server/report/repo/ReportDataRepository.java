package server.report.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import server.report.entity.ReportData;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface ReportDataRepository extends JpaRepository<ReportData, Long> {

    List<ReportData> findAllByAuthorId(Long id);

    Optional<ReportData> findReportDataByFromDate(LocalDate fromDate);
}
