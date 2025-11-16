package com.payment;

public class AppPayment {

    public static void main(String[] args) {
        Ipayment p=new CreditCardPayment();
        PaymentServices ps=new PaymentServices(p);
        ps.processPayment();
    }

}
