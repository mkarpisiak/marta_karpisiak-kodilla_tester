package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    public Rectangle(){
        super(6, 4 , 0);
    }


    @Override
    public void countSurfaceArea() {
        int result= (getA()* getB());
        System.out.println(result + " cm2");
    }

    @Override
    public void countCircuit() {
        int result= ((2*getA()) + (2*getB()));
        System.out.println(result + " cm");

    }
}
