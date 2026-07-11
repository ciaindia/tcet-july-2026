package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

class Employee {
    int eid;
    String name;
    String department;
    int salary;

    public Employee(int eid, String name, String department, int salary) {
        this.eid = eid;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getEid() {
        return eid;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public int getSalary() {
        return salary;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setSalary(int salary) {

        this.salary = salary;
    }

}

@RestController
public class EmployeeController {
    
    private List<Employee> emps = new ArrayList<>();

    public EmployeeController() {   
        emps.add(new Employee(1,"aaa", "HR", 10000));
        emps.add(new Employee(2,"bbb", "IT", 20000));
        emps.add(new Employee(3,"ccc", "HR", 30000));
    }


    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return emps;
    } 
    
}
