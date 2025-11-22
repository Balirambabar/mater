package com.jaybabaji;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TestApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        PaymentService service= context.getBean(PaymentService.class);
        service.processPayment();
        System.out.println("===="+service.hashCode());
        PaymentService service2= context.getBean(PaymentService.class);
        System.out.println("===="+service2.hashCode());



    }
}