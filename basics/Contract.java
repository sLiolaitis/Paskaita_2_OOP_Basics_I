package com.itacademy.java.oop.basics;

public enum Contract {

    FULL_TIME("full_time"), PART_TIME("part_time");

    private String displayValue;

    Contract(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }



    public static Contract note (String text) {
        for (Contract i : values()) {
            if (i.getDisplayValue().equals(text)) {
                return i;
            }
        }
        throw new IllegalArgumentException("enum does not exist");
    }
}
