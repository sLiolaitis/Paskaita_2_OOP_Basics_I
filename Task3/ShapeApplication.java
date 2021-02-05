package com.itacademy.java.oop.basics;

public class ShapeApplication {

    public static void main(String[] args) {

        // Neprintina masyvo elementu atskirai kazkodes... Su objektu viskas tvarkoje

        Square first = new Square(1.2,0);
        Square second = new Square(22,66);
        Square third = new Square(0.2,0.3);
        Square fourth = new Square(-5,5);
        Square fifth = new Square(10,20);


        Square [] squaresList = new Square[5];
        squaresList[0]=first;
        squaresList[1]=second;
        squaresList[2]=third;
        squaresList[3]=fourth;
        squaresList[4]=fifth;


        for (Square a: squaresList) {
            System.out.println(a.printOutEverything());


        }


    }

}
