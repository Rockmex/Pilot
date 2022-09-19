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
        return repo.getDepartmentById(id);
    }

    public List<Department> getAllDepartments() {
        return repo.getAllDepartments();
    }

    public void updateDepartment(int id, Department temp) {
        repo.updateDepartment(id, temp);
    }

    public void newDepartment(Department temp) {
        repo.newDepartment(temp);
    }

    public void deleteDepartmentById(int id) {
        repo.deleteDepartmentById(id);
    }

    // Constructor-based
    @Autowired
    public DepartmentHelper(DepartmentRepository repo) {
        this.repo = repo;
    }
}
