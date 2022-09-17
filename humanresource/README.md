# Spring Boot

### Topic: MVC
**Problems:**
1. define two models: Employee, Department
2. define EmployeeDAO and DepartmentDAO - they should initialize the data and provide CRUD method
3. write EmployeeController and DepartmentController to do CRUD of them
Optional:
4. use tomcat to deploy or springboot if you know it.
5. use postman to test.

### Topic: Service
**Problems:**
1. Put all MVC code into Intellij
2. Add SERVICE layer between Controller & Repository
3. Use Dependency Injection to inject service into controller and inject repository into service - annotation
4. Create a EmployeeHelper and DepartmentHelper class and 
	a) let Spring manage them
	b) inject (use two types of injection) them into service layer
** Service class call EmployeeHelper, EmployeeHelper class call DAO (to use Bean).

### Final Requirement:
**Problems:**
1. Have models match the proviced sql schema.
```
##################### EMPLOYEE TABLE ################
DROP TABLE IF EXISTS employee;
CREATE TABLE employee(
	empid      INT,
    name       VARCHAR(10),
    job        VARCHAR(9),
    manager    INT,
    hiredate   DATE,
    salary     DECIMAL(7,2),
    deptid     INT,
    CONSTRAINT pk_emp PRIMARY KEY (empid)
);

###################### DEPARTMENT TABLE ###############
DROP TABLE IF EXISTS department;
CREATE TABLE department(
    deptid     INT,
    name       VARCHAR(14),
    loc        VARCHAR(13),
    CONSTRAINT pk_dept PRIMARY KEY (deptid)
);
```