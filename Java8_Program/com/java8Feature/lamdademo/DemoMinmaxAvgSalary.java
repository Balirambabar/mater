package com.java8Feature.lamdademo;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class  Employees {

    String name;
    double salary;

    public Employees(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class DemoMinmaxAvgSalary {


    public static void main(String[] args) {

        Employees emp1=new Employees("BALIRAM",20000);
        Employees emp2=new Employees("BHAKTI",15000);
        Employees emp3=new Employees("RAM",6000);
        Employees emp4=new Employees("KESAV",96000);

        List<Employees> list = Arrays.asList(emp1, emp2, emp3, emp4);
        //Stream<Employees> emp = Stream.of(emp1, emp2, emp3, emp4);
        /*Optional<Employees> maxsalary = emp.max(Comparator.comparing(e -> e.salary));
        maxsalary.ifPresent(System.out::println);*/

        /*Optional<Employees> minsal = emp.min(Comparator.comparing(e -> e.salary));
        minsal.ifPresent(System.out::println);*/

        Double collect = list.stream().collect(Collectors.averagingDouble(e -> e.salary));
        System.out.println(collect);


    }
}
