package com.pilot.humanresource.Controller;

import com.pilot.humanresource.Model.SalaryReport;
import com.pilot.humanresource.Model.SalaryReportId;
import com.pilot.humanresource.Service.SalaryReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/salaryReport")
@RestController
public class SalaryReportController {
    private SalaryReportService service;

    @GetMapping("/all")
    public List<SalaryReport> getAllSalaryReports() {
        return service.getAllSalaryReports();
    }

    @GetMapping("/get/{job}_{department}")
    public SalaryReport getSalaryReportById(@PathVariable String job, @PathVariable String department) {
        return service.getSalaryReportById(new SalaryReportId(job, department));
    }

    @PostMapping("/new")
    public void newSalaryReport(@RequestBody SalaryReport temp) {
        service.newSalaryReport(temp);
    }

    public SalaryReportService getService() {
        return service;
    }

    @Autowired
    public void setService(SalaryReportService service) {
        this.service = service;
    }
}
