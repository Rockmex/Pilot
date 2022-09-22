package com.pilot.humanresource.Dao;

import com.pilot.humanresource.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 *  Connected MySql DB with JpaRepository
 * */

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    public Employee findEmployeeByEmpid(int id);
}
