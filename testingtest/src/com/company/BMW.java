package com.company;

public class BMW implements Car{
    @Override
    public void engine() {
        System.out.println("Engine of this car is V8");
    }

    @Override
    public void horsePower() {
        System.out.println("Horsepower is 320HP");
    }
}
