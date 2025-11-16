package com.java8Feature.lamdademo;

import java.util.function.Consumer;

public class DemoConsumer {
    //consumer functional interface
    //will take input and return output-accept()
    public static void main(String[] args) {
        Consumer<String> c1=(name)->System.out.println(name+",Good Evening");
        c1.accept("Baliram");
    }
}
