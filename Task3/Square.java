package com.itacademy.java.oop.basics;

public class Square {

    private double length;
    private double width;

    public Square (){}

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double perimeter () {
        return 2*(this.length+this.width);
    }

    public double area () {
        return this.length*this.width;
    }

    public String printOutEverything () {

        if ((this.width <= 0)||(this.length<=0)) {
            System.out.println("Square side can not be zero or less! \n Side a= "+this.width+"\n Side b= "+this.length);
        } else {
            System.out.println("You have a valid square! \n Side a= "+this.width+"\n Side b= "+this.length+
                    "\nPerimeter = "+perimeter()+"\nArea= "+area());
        }
       return " ";
    }

}
