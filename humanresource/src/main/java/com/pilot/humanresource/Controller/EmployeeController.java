package com.pilot.humanresource.Controller;

import com.pilot.humanresource.Model.Employee;
import com.pilot.humanresource.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

//    // Test the application
//    @GetMapping("/test")
//    public String greetings() {
//        return "Hello";
//    }

    private EmployeeService employeeService;

    @RequestMapping(value="/all", method= RequestMethod.GET)
    public List<Employee> getEmployees(){
        return employeeService.getAllEmployees();
    }


    @GetMapping("/get/{id}")
    public Employee getEmployeeById(@PathVariable int id){
       return employeeService.getEmployeeById(id);
    }

    @PutMapping("/update/{id}")
    public void updateEmployee(@PathVariable int id, @RequestBody Employee temp){
        employeeService.updateEmployee(id, temp);
    }

    @PostMapping("/new")
    public void updateEmployee(@RequestBody Employee temp){
        employeeService.newEmployee(temp);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployeeById(@PathVariable int id){
        employeeService.deleteEmployeeById(id);
        return "/all";
    }

    // Put service getter & setter at the bottom
    public EmployeeService getEmployeeService() {
        return employeeService;
    }

    // Setter-based
    @Autowired
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
}
