package com.dependencyinversionprinciple;

public class App {
    public static void main(String[] args) {
        WebStore webStore = new WebStore(new PaymentProcessor());
        webStore.purchaseItem();
    }
}
