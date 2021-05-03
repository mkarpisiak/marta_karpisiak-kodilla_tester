package com.kodilla.abstracts.homework;

public abstract class Shape {

    private int a;
    private int b;
    private double PI;


    public double getPI(){
        return PI;
    }

    public int getA(){

        return a;
    }
    public int getB(){

        return b;
    }

    public Shape (int a, int b, double PI){
        this.a = a;
        this.b = b;
        this.PI = PI;
    }
    public abstract void countSurfaceArea();

    public abstract void countCircuit();


}
