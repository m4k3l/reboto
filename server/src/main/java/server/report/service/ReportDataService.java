package server.report.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import server.exception.ReportAlreadyExistsException;
import server.exception.ReportNotFoundException;
import server.report.entity.ReportData;
import server.report.repo.ReportDataRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReportDataService {

    private final ReportDataRepository repository;

    public List<ReportData> getAllReportsOfUser(Long id) {
        return repository.findAllByAuthorId(id);
    }

    public void addNewReport(ReportData report) throws ReportAlreadyExistsException {
        Optional<ReportData> reportDataOptional = repository.findReportDataByFromDate(report.getFromDate());
        if(reportDataOptional.isPresent()) {
            throw new ReportAlreadyExistsException(report.getFromDate());
        }
        repository.save(report);
    }

    public void deleteReport(Long id) throws ReportNotFoundException {
        Optional<ReportData> reportDataOptional = repository.findById(id);
        if(reportDataOptional.isEmpty()) {
            throw new ReportNotFoundException();
        }
        repository.delete(reportDataOptional.get());
    }
}
