package com.jaybabaji;

public class CreditCardPayment implements IPayment {
    @Override
    public void processPayment() {
        System.out.println("Credit card  processPayment");
    }
}
