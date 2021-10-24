package com.dependencyinversionprinciple;

public class Payoneer implements PaymentMethod{
    @Override
    public void Pay() {
        System.out.println("Payoneer");
    }
}
