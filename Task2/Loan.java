package com.itacademy.java.oop.basics;

public class Loan {

    private int id;
    private double amount;
    private String loanType;
    private String terminationDate;

    public Loan () {}

    public Loan(int id, double amount, String loanType, String terminationDate) {
        this.id = id;
        this.amount = amount;
        this.loanType = loanType;
        this.terminationDate = terminationDate;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public String getLoanType() {
        return loanType;
    }

    public String getTerminationDate() {
        return terminationDate;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "id=" + id +
                ", amount=" + amount +
                ", loanType='" + loanType + '\'' +
                ", terminationDate='" + terminationDate + '\'' +
                '}';
    }
}
