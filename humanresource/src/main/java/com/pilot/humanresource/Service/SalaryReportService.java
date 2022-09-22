package com.pilot.humanresource.Service;

import com.pilot.humanresource.Helper.SalaryReportHelper;
import com.pilot.humanresource.Model.SalaryReport;
import com.pilot.humanresource.Model.SalaryReportId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryReportService {
    @Autowired
    private SalaryReportHelper helper;

    public SalaryReport getSalaryReportById(SalaryReportId id) {
        return helper.getSalaryReportById(id);
    }

    public List<SalaryReport> getAllSalaryReports() {
        return helper.getAllSalaryReports();
    }

    public void newSalaryReport(SalaryReport salaryReport) {
        helper.newSalaryReport(salaryReport);
    }

}
