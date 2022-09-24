package com.pilot.humanresource.Helper;

import com.pilot.humanresource.Dao.DepartmentRepository;
import com.pilot.humanresource.Model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DepartmentHelper {

    private DepartmentRepository repo;

    public Department getDepartmentById(int id) {
        return repo.findDepartmentByDeptid(id);
    }

    public List<Department> getAllDepartments() {
        return repo.findAll();
    }

    public void updateDepartment(int id, Department temp) {
        Department dept = repo.findDepartmentByDeptid(id);
        dept.setLoc(temp.getLoc());
        dept.setName(temp.getName());
        repo.save(dept);
    }

    public void newDepartment(Department temp) {
        repo.save(temp);
    }

    public void deleteDepartmentById(int id) {
        repo.deleteById(id);
    }

    // Constructor-based
    @Autowired
    public DepartmentHelper(DepartmentRepository repo) {
        this.repo = repo;
    }
}
