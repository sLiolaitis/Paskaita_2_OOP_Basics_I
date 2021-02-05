package com.itacademy.java.oop.basics;

import java.text.DecimalFormat;

public class PointApplication {

    public static void main(String[] args) {

        DecimalFormat df2 = new DecimalFormat("#.##");
        MyPoint first = new MyPoint(3, 4);
        MyPoint second = new MyPoint(5, 0);
        first.getX();
        first.setX(4);
        first.getX();
        first.getY();
        second.setY(1);
        second.setXY(0, 5);
        System.out.println("Point coordinates: ");
        for (int i = 0; i<2; i++) {
            System.out.println(second.getXY()[i]);
        }
        System.out.println(first.toString());
        System.out.println("Distance form point to (0,0) "+df2.format(first.distance()));
        System.out.println("Distance from first point to second: "+
                df2.format(first.distance(second)));
        System.out.println("Distance from first point to (1,8) is "+
                df2.format(first.distance(1, 8)));
    }
}
