package server.report.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import server.report.entity.ReportComment;

import java.util.List;

@Repository
public interface ReportCommentRepository extends JpaRepository<ReportComment, Long> {

    List<ReportComment> findAllByCommentingUserId(Long id);
}
