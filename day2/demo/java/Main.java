import java.util.*;


class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}


class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee(1, "aaa"));
        emps.add(new Employee(2, "bbb"));
        emps.add(new Employee(3, "ccc"));

        System.out.println(emps);

        // Employee e1 = new Employee(1, "aaa");
        // System.out.println(e1);       
    }
}
