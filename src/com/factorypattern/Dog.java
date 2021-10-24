package com.factorypattern;

public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("Dog is Eating.");
    }
    public void talk(){
        System.out.println("Woof");
    }
}
