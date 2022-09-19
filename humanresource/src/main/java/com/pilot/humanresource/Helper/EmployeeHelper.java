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
        return repo.getEmployeeById(id);
    }

    public List<Employee> getAllEmployees() {
        return repo.getAllEmployees();
    }

    public void updateEmployee(int id, Employee temp) {
        repo.updateEmployee(id, temp);
    }

    public void newEmployee(Employee temp) {
        repo.newEmployee(temp);
    }

    public void deleteEmployeeById(int id) {
        repo.deleteEmployeeById(id);
    }

    // Constructor-based
    @Autowired
    public EmployeeHelper(EmployeeRepository repo) {
        this.repo = repo;
    }

}
