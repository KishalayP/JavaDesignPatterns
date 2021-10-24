package com.dependencyinversionprinciple;

public class PaymentProcessor {
    private PaymentMethod paymentMethod;

    public PaymentProcessor() {
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void pay(){
        this.paymentMethod.Pay();
    }
}
