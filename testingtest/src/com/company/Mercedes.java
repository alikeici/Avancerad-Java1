package com.company;

public class Mercedes implements Car{
    @Override
    public void engine() {
        System.out.println("Engine of this car is V12");
    }

    @Override
    public void horsePower() {
        System.out.println("Horsepower is 510HP");
    }
}
