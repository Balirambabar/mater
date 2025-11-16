package com.java8Feature.lamdademo;

import java.util.function.Predicate;

public class LambdaDemoN {
    public static void main(String[] args) {
        //predicate is java 8 funtional interface
        Predicate<Integer> p = i -> i > 10;
        //p.test(5);
        System.out.println(p.test(12));

    }







}