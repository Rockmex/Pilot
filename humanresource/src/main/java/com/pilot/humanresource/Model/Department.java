package com.pilot.humanresource.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department {
    @Id
    private int deptid;
    private String name;
    private String loc;

    public Department() {
    }

    public Department(int deptid, String name, String loc) {
        this.deptid = deptid;
        this.name = name;
        this.loc = loc;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int id) {
        this.deptid = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}
