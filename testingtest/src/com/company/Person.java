package com.company;

public class Person {
    private String Name;
    private String Gender;
    private double Salary;


    public Person(String Name, String Gender, double Salary) {
        this.Name = Name;
        this.Gender = Gender;
        this.Salary = Salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    @Override
    public String toString() {
        return "Person [name=" + Name + ", gender=" + Gender + ", salary=" + Salary + "]";
    }
}
