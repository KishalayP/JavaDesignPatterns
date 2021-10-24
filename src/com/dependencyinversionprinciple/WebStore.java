package com.dependencyinversionprinciple;

public class WebStore {
    PaymentProcessor paymentProcessor;

    public WebStore(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
        paymentProcessor.setPaymentMethod(new PayPal());
    }

    public void purchaseItem(){
        this.paymentProcessor.pay();
    }
}

