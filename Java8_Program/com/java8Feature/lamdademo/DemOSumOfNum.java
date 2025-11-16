package com.java8Feature.lamdademo;

import java.util.stream.Stream;

public class DemOSumOfNum {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //int  sum = stream.mapToInt(Integer::intValue).sum();
        final var reduce = stream.reduce(0, (x, y) -> x + y);
        System.out.println(reduce);
    }
}
