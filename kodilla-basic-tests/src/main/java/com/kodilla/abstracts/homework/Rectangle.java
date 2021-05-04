package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    private int a;
    private int b;


    public Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int getA(){
        return a;
    }

    public int getB(){
        return b;
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
