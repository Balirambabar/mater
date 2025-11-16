package com.java8Feature.lamdademo;

import java.util.function.Supplier;

public class DemoSupplier {
    public static void main(String[] args) {
        //Supplier will not take input only return value
        //otp generation logic-get()

        Supplier<String> supplier = () -> {
            String otp="";
            for(int i=0;i<6;i++) {
                otp=otp + (int)(Math.random() * 10);
            }
              return otp;
        };
        System.out.println(supplier.get());



    }
}
