package com.itacademy.java.oop.basics;

public enum Sex {

    MALE("m"),FEMALE("f");

    private String displayValue;

    Sex(String displayValue) {
        this.displayValue = displayValue;
    }
}
