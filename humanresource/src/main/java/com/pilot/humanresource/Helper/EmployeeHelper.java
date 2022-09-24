package com.pilot.humanresource.Helper;

import com.pilot.humanresource.Dao.EmployeeRepository;
import com.pilot.humanresource.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeHelper {
    private EmployeeRepository repo;

    public Employee getEmployeeById(int id) {
        return repo.findEmployeeByEmpid(id);
    }

    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    public void updateEmployee(int id, Employee temp) {
        Employee employee = repo.findEmployeeByEmpid(id);
        employee.setJob(temp.getJob());
        employee.setName(temp.getName());
        employee.setManager(temp.getManager());
        employee.setHireDate(temp.getHireDate());
        employee.setSalary(temp.getSalary());
        employee.setDeptId(temp.getDeptId());
        repo.save(employee);
    }

    public void newEmployee(Employee temp) {
        repo.save(temp);
    }

    public void deleteEmployeeById(int id) {
        repo.deleteById(id);
    }

    // Constructor-based
    @Autowired
    public EmployeeHelper(EmployeeRepository repo) {
        this.repo = repo;
    }

}
