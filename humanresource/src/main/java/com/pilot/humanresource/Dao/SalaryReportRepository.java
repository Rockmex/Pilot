package com.pilot.humanresource.Dao;

import com.pilot.humanresource.Model.SalaryReport;
import com.pilot.humanresource.Model.SalaryReportId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryReportRepository extends JpaRepository<SalaryReport, SalaryReportId> {
    public SalaryReport getSalaryReportById(SalaryReportId id);
}
