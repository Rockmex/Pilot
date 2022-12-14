package com.pilot.humanresource.Dao;

import com.pilot.humanresource.Model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 *  In memory DB with static block
 * */

@Repository
public class EmployeeDao {
    static List<Employee> employees;

    static {
        employees = new ArrayList<>();
        employees.add(new Employee(1, "Luis", "manager", 0, "2019-01-01", 2000000.0, 1));
        employees.add(new Employee(2, "Lucy", "developer", 1, "2020-10-10", 1000000.0, 1));
    }

    public List<Employee> getAllEmployees(){
        return employees;
    }

    public Employee getEmployeeById(int id){
        return employees.stream().filter(e -> id == e.getEmpid()).findFirst().orElse(null);
    }

    public void updateEmployee(int id, Employee temp){
        Employee target = this.getEmployeeById(id);
        target.setName(temp.getName());
    }

    public void updateEmployee(Employee temp){
        Employee target = employees.stream().filter(e -> temp.getEmpid() == e.getEmpid()).findFirst().orElse(null);
        if(target != null){
            target.setName(temp.getName());
        }
    }

    public void newEmployee(Employee temp){
        //temp should not exist already in employees -- sanity check
        int maxId = employees.stream().mapToInt(e -> e.getEmpid()).max().getAsInt();
        temp.setEmpid(maxId + 1);
        employees.add(temp);
    }

    public void deleteEmployeeById(int id){
        Iterator<Employee> it = employees.iterator();
        while(it.hasNext()){
            Employee temp = it.next();
            if(id == temp.getEmpid()){
                it.remove();
            }
        }
    }

    public void deleteAllEmployees(){
        //  employees = new ArrayList<>();
        employees.clear();
    }
}
