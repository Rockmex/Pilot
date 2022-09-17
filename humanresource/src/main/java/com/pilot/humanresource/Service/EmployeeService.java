package com.pilot.humanresource.Service;

import com.pilot.humanresource.Helper.EmployeeHelper;
import com.pilot.humanresource.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    // Field-based
    @Autowired
    private EmployeeHelper helper;

    public Employee getEmployeeById(int id) {
        return helper.getEmployeeById(id);
    }

    public List<Employee> getAllEmployees() {
        return helper.getAllEmployees();
    }

    public void updateEmployee(int id, Employee temp) {
        helper.updateEmployee(id, temp);
    }

    public void newEmployee(Employee temp) {
        helper.newEmployee(temp);
    }

    public void deleteEmployeeById(int id) {
        helper.deleteEmployeeById(id);
    }
}
