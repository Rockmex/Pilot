package com.pilot.humanresource.Model;

import javax.persistence.*;

@Entity
@Table(name = "salary_report")
public class SalaryReport {
    @EmbeddedId
    private SalaryReportId id;
    private double salmin;
    private double salmax;
    private double saltotal;
    private int empcount;
    @Column(name = "updatetime")
    private String updateTime;

    public SalaryReport() {

    }

    public SalaryReport(SalaryReportId id, double salmin, double salmax, double saltotal, int empcount, String updateTime) {
        this.id = id;
        this.salmin = salmin;
        this.salmax = salmax;
        this.saltotal = saltotal;
        this.empcount = empcount;
        this.updateTime = updateTime;
    }

    public SalaryReportId getId() {
        return id;
    }

    public void setId(SalaryReportId id) {
        this.id = id;
    }

    public double getSalmin() {
        return salmin;
    }

    public void setSalmin(double salmin) {
        this.salmin = salmin;
    }

    public double getSalmax() {
        return salmax;
    }

    public void setSalmax(double salmax) {
        this.salmax = salmax;
    }

    public double getSaltotal() {
        return saltotal;
    }

    public void setSaltotal(double saltotal) {
        this.saltotal = saltotal;
    }

    public int getEmpcount() {
        return empcount;
    }

    public void setEmpcount(int empcount) {
        this.empcount = empcount;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
