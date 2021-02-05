package com.itacademy.java.oop.basics;

public class LoansApplication {

    public static void main(String[] args) {



        Loan leasing = new Loan(1,12000.00, LoanType.LEASING.getDisplayValue(),"2025.03.05" );
        Loan consumer = new Loan(2,1050.50, LoanType.CONSUMER.getDisplayValue(), "2022.04.03" );

        Loan listOfLoans []  = new Loan[2];
        listOfLoans [0] = leasing;
        listOfLoans[1] = consumer;


        Customer adomas = new Customer("Adomas","Petkevicius",33,863000222, listOfLoans );

        System.out.println(adomas);

    }

}
