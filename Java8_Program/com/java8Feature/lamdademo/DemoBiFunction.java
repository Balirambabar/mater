package com.java8Feature.lamdademo;

import java.util.Comparator;
import java.util.function.BiFunction;

public class DemoBiFunction {
    public static void main(String[] args) {

        // take 2 input as number and Return output as sum of two number
        BiFunction<Integer,Integer,Integer> sumoftwo= (a, b) -> a + b;
        System.out.println(sumoftwo.apply(1,20));


    }
}
