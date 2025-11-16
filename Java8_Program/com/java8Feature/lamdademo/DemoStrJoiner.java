package com.java8Feature.lamdademo;

import java.util.StringJoiner;

public class DemoStrJoiner {
    public static void main(String[] args) {

        StringJoiner sj=new  StringJoiner(",","[","]");
        sj.add("Hello");
        sj.add("World");
        System.out.println(sj);
    }
}
