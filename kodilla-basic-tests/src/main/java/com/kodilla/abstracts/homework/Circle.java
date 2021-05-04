package com.kodilla.abstracts.homework;

public class Circle extends Shape {

private int r;
static final double PI= 3.14;


    public Circle(int r) {
        this.r= r;
    }

    public int getR(){
        return r;
    }

    public double getPi (){
        return PI;
    }

    @Override
    public void countSurfaceArea() {
        System.out.println(getPi() * (getR()*getR()) + " cm2");

    }

    @Override
    public void countCircuit() {
        System.out.println( 2* getPi() * getR() + "cm");

    }
}
