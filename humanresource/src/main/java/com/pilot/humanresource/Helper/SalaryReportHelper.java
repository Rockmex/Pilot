package com.pilot.humanresource.Helper;

import com.pilot.humanresource.Dao.SalaryReportRepository;
import com.pilot.humanresource.Model.SalaryReport;
import com.pilot.humanresource.Model.SalaryReportId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SalaryReportHelper {
    private SalaryReportRepository repo;

    public SalaryReport getSalaryReportById(SalaryReportId id) {
        return repo.getSalaryReportById(id);
    }

    public List<SalaryReport> getAllSalaryReports() {
        return repo.findAll();
    }

    public void newSalaryReport(SalaryReport salaryReport) {
        repo.save(salaryReport);
    }

    @Autowired
    public SalaryReportHelper(SalaryReportRepository repo) {
        this.repo = repo;
    }
}
