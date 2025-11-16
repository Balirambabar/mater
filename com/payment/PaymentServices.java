package com.payment;

public class PaymentServices {
    Ipayment payBills;
    public PaymentServices(Ipayment payBills) {
        this.payBills = payBills;
    }
    public void processPayment() {
        payBills.processPayment();
    }






}
