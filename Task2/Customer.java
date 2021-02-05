package com.itacademy.java.oop.basics;

import java.util.Arrays;

public class Customer {

    private String name;
    private String surname;
    private int age;
    private int personalNumber;
    Loan [] loans;

    public Customer () {}

    public Customer(String name, String surname, int age, int personalNumber, Loan[] loans) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.personalNumber = personalNumber;
        this.loans = loans;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getPersonalNumber() {
        return personalNumber;
    }

    public Loan[] getLoans() {
        return loans;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", personalNumber=" + personalNumber +
                ", loans=" + Arrays.toString(loans) +
                '}';
    }
}
