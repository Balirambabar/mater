package com.java8Feature.lamdademo;

import java.util.Arrays;
import java.util.List;

public class StreamCollNum {
    public static void main(String[] args) {


      /*  Integer[] listNumber = {2, 4, 33, 56, 23, 20, 18};
        Arrays.stream(listNumber).filter(i->i>20).forEach(System.out::println);*/

        /*for (Integer nums : listNumber) {

            if (nums > 20) {
                System.out.println(nums);
            }
        }*/
        List<Integer> list = Arrays.asList(2, 4, 33, 56, 23, 20, 18);
        list.stream().filter(i->i>20).forEach(System.out::println);
    }
}
