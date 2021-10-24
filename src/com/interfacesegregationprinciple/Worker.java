package com.interfacesegregationprinciple;

public class Worker implements Employee {
    @Override
    public void salary() {
        System.out.println("2 Paisa");
    }
}
