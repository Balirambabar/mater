package com.payment;

public class CreditCardPayment implements Ipayment {

    @Override
    public void processPayment() {
        System.out.println("Credit Card Payment");
    }
}
