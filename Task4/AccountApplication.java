package com.itacademy.java.oop.basics;

public class AccountApplication {

    public static void main(String[] args) {

        Account irmantas = new Account("12.587.41","Irmantas Malinauskas",100);
        Account gilvydas = new Account("58.74.987","Gilvydas Zvagulis",50);

        irmantas.credit(20);
        irmantas.credit(10);
        System.out.println("Current balance of "+irmantas.getName()+" is "+irmantas.getBalance());
        gilvydas.credit(10);
        System.out.println("Current balance of "+gilvydas.getName()+" is "+gilvydas.getBalance());

        try {
            irmantas.debit(500);
            System.out.println("Current balance of "+irmantas.getName()+" is "+irmantas.getBalance());
        }catch (AmountExceededException someError) {
            System.out.println(someError.getMessage());
        }

        try{
            gilvydas.transferTo(irmantas,70);
        } catch (AmountExceededException someError) {
            System.out.println(someError.getMessage());
        }

        try {
            irmantas.debit(30);
            System.out.println("Current balance of "+irmantas.getName()+" is "+irmantas.getBalance());
        } catch (AmountExceededException someError) {
            System.out.println(someError.getMessage());
        }

        try{
            irmantas.transferTo(gilvydas,10);
            System.out.println("Current balance of "+irmantas.getName()+" is "+irmantas.getBalance());
            System.out.println("Current balance of "+gilvydas.getName()+" is "+gilvydas.getBalance());
        } catch (AmountExceededException someError) {
            System.out.println(someError.getMessage());
        }

        System.out.println(irmantas.toString());
        System.out.println(gilvydas.toString());

    }

}
