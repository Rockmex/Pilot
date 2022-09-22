package com.pilot.humanresource.Dao;

import com.pilot.humanresource.Model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 *  Connected MySql DB with JpaRepository
 * */

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
    public Department findDepartmentByDeptid(int id);
}
