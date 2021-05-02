package com.kodilla.abstracts.homework;

public class Triangle extends Shape{

    public Triangle (){
        super (4 , 10 , 0);
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

