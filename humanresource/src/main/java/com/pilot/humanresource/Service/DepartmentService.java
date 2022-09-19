package com.pilot.humanresource.Service;

import com.pilot.humanresource.Helper.DepartmentHelper;
import com.pilot.humanresource.Model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    // Field-based
    @Autowired
    private DepartmentHelper helper;

    public Department getDepartmentById(int id) {
        return helper.getDepartmentById(id);
    }

    public List<Department> getAllDepartments() {
        return helper.getAllDepartments();
    }

    public void updateDepartment(int id, Department temp) {
        helper.updateDepartment(id, temp);
    }

    public void newDepartment(Department temp) {
        helper.newDepartment(temp);
    }

    public void deleteDepartmentById(int id) {
        helper.deleteDepartmentById(id);
    }

}
