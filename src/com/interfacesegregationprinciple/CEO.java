package com.interfacesegregationprinciple;

public class CEO implements CEOInterface{

    @Override
    public void makeDecisions() {
        System.out.println("My Company");
    }

    @Override
    public void addStocks() {
        System.out.println("Add 1000 Stocks");
    }

    @Override
    public void salary() {
        System.out.println("CEO Salary 5000000");
    }

    @Override
    public void hire() {
        System.out.println("Hire You");
    }

    @Override
    public void train() {
        System.out.println("Training YOu");
    }

    @Override
    public void addBonus() {
        System.out.println("+1000000");
    }
}
