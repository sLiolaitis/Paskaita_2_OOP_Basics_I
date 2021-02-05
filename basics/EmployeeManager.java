package com.itacademy.java.oop.basics;

public class EmployeeManager {

    public static void main(String[] args) {
        Employee kazys = new Employee("Kazys", "Kazlevicius",
                Contract.FULL_TIME, "2021.06.09", 750.65, "Sales manager");

        System.out.println(kazys.toString());



    }

}
