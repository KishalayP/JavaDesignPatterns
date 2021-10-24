package com.dependencyinversionprinciple;

public class PayPal implements PaymentMethod{
    @Override
    public void Pay() {
        System.out.println("PayPal");
    }
}
