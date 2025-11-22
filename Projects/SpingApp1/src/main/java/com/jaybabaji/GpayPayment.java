package com.jaybabaji;

public class GpayPayment implements IPayment {
    @Override
    public void processPayment() {
        System.out.println("Gpay processPayment");
    }
}
