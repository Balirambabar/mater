package com.jaybabaji;

public class PaymentService {

    IPayment payment;
    public PaymentService() {
    }
    public PaymentService(IPayment payment) {
        this.payment = payment;
    }
  public void processPayment() {
        payment.processPayment();
  }
    public void setPayment(IPayment payment) {
        this.payment = payment;
    }
}
