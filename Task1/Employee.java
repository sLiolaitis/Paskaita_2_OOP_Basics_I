package com.itacademy.java.oop.basics;

public class Employee {

    private String name;
    private String surname;
    private Contract contract;
    private String contractStartDate;
    private Double salary;
    private String position;

    public Employee () {}

    public Employee(String name, String surname, Contract contract, String contractStartDate, Double salary, String position) {
        this.name = name;
        this.surname = surname;
        this.contract = contract;
        this.contractStartDate = contractStartDate;
        this.salary = salary;
        this.position = position;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", contract=" + contract +
                ", contractStartDate='" + contractStartDate + '\'' +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                '}';
    }
}
