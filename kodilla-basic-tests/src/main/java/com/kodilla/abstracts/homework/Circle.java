package com.kodilla.abstracts.homework;

public class Circle extends Shape {


    public Circle() {
        super(7, 0, 3.1415);
    }

    @Override
    public void countSurfaceArea() {
        System.out.println(getPI() * (getA()*getA()) + " cm2");

    }

    @Override
    public void countCircuit() {
        System.out.println( 2* getPI() * getA() + "cm");

    }
}
