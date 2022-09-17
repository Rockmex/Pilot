package com.pilot.humanresource.Helper;

import com.pilot.humanresource.Dao.EmployeeRepository;
import com.pilot.humanresource.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeHelper {
    private EmployeeRepository employeeRepository;

    public Employee getEmployeeById(int id) {
        return employeeRepository.getEmployeeById(id);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }

    public void updateEmployee(int id, Employee temp) {
        employeeRepository.updateEmployee(id, temp);
    }

    public void newEmployee(Employee temp) {
        employeeRepository.newEmployee(temp);
    }

    public void deleteEmployeeById(int id) {
        employeeRepository.deleteEmployeeById(id);
    }

    // Constructor-based
    @Autowired
    public EmployeeHelper(EmployeeRepository repo) {
        this.employeeRepository = repo;
    }

}
