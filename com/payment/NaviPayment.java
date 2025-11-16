package com.payment;

public class NaviPayment implements Ipayment {
    @Override
    public void processPayment() {
        System.out.println("Navi Payment");
    }
}
