package com.java8Feature.lamdademo;


import javax.security.sasl.SaslClient;
import java.util.Optional;
import java.util.Scanner;

public class UserNameService {
    public static void main(String[] args) {
System.out.println("enter the user id-");
        Scanner sc = new Scanner(System.in);

        int id=sc.nextInt();
        User user=new User();
        Optional<String> userName = user.getUserName(id);

        if(userName.isPresent()) {
            System.out.println(userName.get().toUpperCase());
        }
        else {
        System.out.println("Username not found");
        }
    }
}
