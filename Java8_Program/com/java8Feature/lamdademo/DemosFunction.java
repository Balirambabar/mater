package com.java8Feature.lamdademo;

import java.util.function.Function;

public class DemosFunction {
    public static void main(String[] args) {
        //will take input and return value-apply()
        Function<String,Integer> f=name-> name.length();
        System.out.println(f.apply("trupti"));
    }





}
