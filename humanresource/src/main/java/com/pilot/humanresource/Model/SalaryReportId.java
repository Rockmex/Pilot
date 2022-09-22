package com.pilot.humanresource.Model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class SalaryReportId implements Serializable {
    private String job;
    private String department;

    public SalaryReportId() {

    }

    public SalaryReportId(String job, String department) {
        this.job = job;
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SalaryReportId that = (SalaryReportId) o;
        return job.equals(that.job) && department.equals(that.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(job, department);
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
