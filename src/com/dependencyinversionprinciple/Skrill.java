package com.dependencyinversionprinciple;

public class Skrill implements PaymentMethod{
    @Override
    public void Pay() {
        System.out.println("Skrill");
    }
}
