package com.payment;

public class DebitCardPayment implements Ipayment {
    @Override
    public void processPayment() {
        System.out.println("Debit Card Payment");
    }
}
