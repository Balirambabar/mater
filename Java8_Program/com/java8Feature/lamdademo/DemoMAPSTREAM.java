package com.java8Feature.lamdademo;

import com.sun.tools.javac.Main;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.stream.Stream;

class Employee {
    String name;
    int age;
    double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }



    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}

public class DemoMAPSTREAM {
    public static void main(String[] args) {
        Employee emp1 = new Employee("baliram",30,30000);
        Employee emp2 = new Employee("bhakti",30,50000);

        Stream<Employee> emp= Stream.of(emp1,emp2);
        emp.filter(e->e.salary>=50000)
                .map(e1->e1.name +" "+e1.age)
                .forEach(System.out::println);
    }
}
