package com.interfacesegregationprinciple;

public class Manager implements Managers{
    @Override
    public void salary() {
        System.out.println("Manager Salary 50000");
    }

    @Override
    public void hire() {
        System.out.println("Hire You ,Manager");
    }

    @Override
    public void train() {
        System.out.println("Training You ,Manager");
    }

    @Override
    public void addBonus() {
        System.out.println("+1000");
    }
}
