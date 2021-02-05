package com.itacademy.java.oop.basics;

public class MyPoint {

    private int x = 0;
    private int y = 0;
    private int [] XY;

    public MyPoint () {}

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
        this.XY = new int[]{x, y};
    }

    public int getX() {
        System.out.println("x coordinate of this point is: "+this.x);
        return x;
    }

    public void setX(int x) {
        System.out.println("You sat a new x coordinate for this point: "+x);
        this.x = x;
    }

    public int getY() {
        System.out.println("y coordinate of this point is: "+this.y);
        return y;
    }

    public void setY(int y) {
        System.out.println("You sat a new y coordinate for this point: "+y);
        this.y = y;
    }

    public int [] getXY() {

        return XY;
    }

    public void setXY(int x, int y){
        System.out.println("You sat new x and y values. x= "+x+" y= "+y);
        this.XY[0]=x;
        this.XY[1]=y;

    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double distance (int x, int y){
        return Math.sqrt(Math.pow((this.x-x), 2)+Math.pow(this.y-y,2));
    }

    public double distance (MyPoint another) {
        return Math.sqrt(Math.pow((another.getX()- this.x),2)+Math.pow(another.getY()- this.y,2));
    }

    public double distance () {
        return Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
    }

}
