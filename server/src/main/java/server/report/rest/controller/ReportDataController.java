package server.report.rest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import server.exception.ReportAlreadyExistsException;
import server.exception.ReportNotFoundException;
import server.report.rest.mapper.ReportDataMapper;
import server.report.rest.resource.ReportDataResource;
import server.report.service.ReportDataService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reports")
public class ReportDataController {

    private final ReportDataService service;
    private final ReportDataMapper mapper;

    @GetMapping("/{userId}")
    public List<ReportDataResource> getAllReportsForUser(@PathVariable Long userId) {
        return mapper.map(service.getAllReportsOfUser(userId));
    }

    @PostMapping
    public void addNewReport(ReportDataResource resource) throws ReportAlreadyExistsException {
        service.addNewReport(mapper.map(resource));
    }

    @DeleteMapping("/{id}")
    public void deleteReport(@PathVariable Long id) throws ReportNotFoundException {
        service.deleteReport(id);
    }
}
