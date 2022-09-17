package com.pilot.humanresource.Controller;

import com.pilot.humanresource.Model.Department;
import com.pilot.humanresource.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    private DepartmentService service;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Department> getAllDepartments() {
        return service.getAllDepartments();
    }

    @GetMapping("/get/{id}")
    public Department getDepartmentById(@PathVariable int id) {
        return service.getDepartmentById(id);
    }

    @PutMapping("/update/{id}")
    public void updateDepartment(@PathVariable int id, @RequestBody Department temp) {
        service.updateDepartment(id, temp);
    }

    @PostMapping("/new")
    public void createDepartment(@RequestBody Department temp) {
        service.newDepartment(temp);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDepartmentById(@PathVariable int id) {
        service.deleteDepartmentById(id);
    }

    public DepartmentService getService() {
        return service;
    }

    @Autowired
    public void setService(DepartmentService service) {
        this.service = service;
    }
}
