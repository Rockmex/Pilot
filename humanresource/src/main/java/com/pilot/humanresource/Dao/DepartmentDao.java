package com.pilot.humanresource.Dao;

import com.pilot.humanresource.Model.Department;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
*  In memory DB with static block
* */

@Repository
public class DepartmentDao {
    static List<Department> departments;

    static {
        departments = new ArrayList<>();
        departments.add(new Department(1, "Finance", "NY"));
        departments.add(new Department(2, "Development", "NJ"));
    }

    public List<Department> getAllDepartments(){
        return departments;
    }

    public Department getDepartmentById(int id){
        return departments.stream().filter(e -> id == e.getDeptid()).findFirst().orElse(null);
    }

    public void updateDepartment(int id, Department temp){
        Department target = this.getDepartmentById(id);
        target.setName(temp.getName());
    }

    public void updateDepartment(Department temp){
        Department target = departments.stream().filter(e -> temp.getDeptid() == e.getDeptid()).findFirst().orElse(null);
        if(target != null){
            target.setName(temp.getName());
        }
    }

    public void newDepartment(Department temp){
        //temp should not exist already in employees -- sanity check
        int maxId = departments.stream().mapToInt(e -> e.getDeptid()).max().getAsInt();
        temp.setDeptid(maxId + 1);
        departments.add(temp);
    }

    public void deleteDepartmentById(int id){
        Iterator<Department> it = departments.iterator();
        while(it.hasNext()){
            Department temp = it.next();
            if(id == temp.getDeptid()){
                it.remove();
            }
        }
    }

    public void deleteAllDepartments(){
        //  employees = new ArrayList<>();
        departments.clear();
    }
}
