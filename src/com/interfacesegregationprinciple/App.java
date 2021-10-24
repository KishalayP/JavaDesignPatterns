package com.interfacesegregationprinciple;

public class App {
    public static void main(String[] args) {
        Employee e = new Worker();
        e.salary();

        CEOInterface ceo = new CEO();
        ceo.addBonus();
        ceo.salary();
        ceo.makeDecisions();
        ceo.addStocks();
        ceo.train();
        ceo.hire();

        Managers mng = new Manager();
        mng.addBonus();
        mng.salary();
        mng.train();
        mng.hire();
    }
}
