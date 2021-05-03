package com.kodilla.abstracts.homework;

public class Triangle extends Shape{

    public Triangle (int a, int b, double PI){
        super ();
    }

    @Override
    public void countSurfaceArea() {
        int result= ((getA()* getB()/2));
        System.out.println(result + " cm2");
    }

    @Override
    public void countCircuit() {
        System.out.println("utknęłam przy wyliczaniu pierwiastka z boku c trójkąta <facepalm>");
    }


}

