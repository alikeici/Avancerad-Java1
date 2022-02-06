package com.company;

public class Volvo implements Car {

    @Override
    public void engine() {
        System.out.println("Engine of this car is T8");
    }

    @Override
    public void horsePower() {
        System.out.println("Horsepower is 415HP");
    }
}
