package server.report.rest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import server.exception.CommentNotFoundException;
import server.report.rest.mapper.ReportCommentMapper;
import server.report.rest.resource.ReportCommentResource;
import server.report.service.ReportCommentService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/comments")
public class ReportCommentController {

    private final ReportCommentService service;
    private final ReportCommentMapper mapper;

    @GetMapping("/{reportId}")
    public List<ReportCommentResource> getAllCommentsForReport(@PathVariable Long reportId) {
        return mapper.map(service.getAllCommentsForReport(reportId));
    }

    @PostMapping
    public void addNewComment(@RequestBody ReportCommentResource resource) {
        service.addNewComment(mapper.map(resource));
    }

    @DeleteMapping("/{id}")
    public void deleteComment(@PathVariable Long id) throws CommentNotFoundException {
        service.deleteComment(id);
    }
}
