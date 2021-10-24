package com.factorypattern;

public class App {

    public static void main(String[] args) {
        Animal animal = AnimalFactory.getAnimal(AnimalType.DOG);
        animal.eat();
        Animal animal1 = new Dog();
        animal1.eat();
    }
}
