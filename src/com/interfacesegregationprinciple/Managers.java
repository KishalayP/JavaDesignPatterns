package com.interfacesegregationprinciple;

public interface Managers extends Employee{
    // managers
    public void hire();
    public void train();
    // CEO + managers
    public void addBonus();

}
