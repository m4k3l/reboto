package server.report.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import server.exception.CommentNotFoundException;
import server.report.entity.ReportComment;
import server.report.entity.ReportData;
import server.report.repo.ReportCommentRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReportCommentService {

    private final ReportCommentRepository repository;

    public List<ReportComment> getAllCommentsForReport(ReportData reportData) {
        return repository.findAllByCommentingUserId(reportData.getAuthor().getId());
    }

    public void addNewComment(ReportComment reportComment) {
        repository.save(reportComment);
    }

    public void deleteComment(Long id) throws CommentNotFoundException {
        Optional<ReportComment> reportCommentOptional = repository.findById(id);
        if(reportCommentOptional.isEmpty()) {
            throw new CommentNotFoundException();
        }
        repository.delete(reportCommentOptional.get());
    }
}
