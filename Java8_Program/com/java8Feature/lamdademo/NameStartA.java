package com.java8Feature.lamdademo;

import java.util.function.Predicate;

public class NameStartA {

    public static void main(String[] args) {
        //declare name in array start and print name starting with A

        String[] firstnames = {"Baliram", "Bhakti", "Sunil", "Pooja"};
         Predicate<String> p=names->names.charAt(0)=='B';
         for (String name : firstnames) {
             if (p.test(name)) {
                 System.out.println(name);
             }
         }


    }
}
