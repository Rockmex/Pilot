package com.pilot.humanresource.Model;

public class Employee {
    private int id;
    private String name;
    private String job;
    private int managerId;
    private String hireDate;
    private double salary;
    private int deptId;

    public Employee() {
    }

    public Employee(int id, String name, String job, int managerId, String hireDate, double salary, int deptId) {
        this.id = id;
        this.name = name;
        this.job = job;
        this.managerId = managerId;
        this.hireDate = hireDate;
        this.salary = salary;
        this.deptId = deptId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }
}
