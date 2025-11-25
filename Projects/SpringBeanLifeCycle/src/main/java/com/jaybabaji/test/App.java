package com.jaybabaji.test;

import com.jaybabaji.dao.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

            ApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
       AppConfig app= ctx.getBean(AppConfig.class);



    }
}
