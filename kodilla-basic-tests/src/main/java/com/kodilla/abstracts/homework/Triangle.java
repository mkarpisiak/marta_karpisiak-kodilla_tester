package com.kodilla.abstracts.homework;

public class Triangle extends Shape{

        private int a;
        private int h;
    public Triangle (int a, int h){
        this.a = a;
        this.h = h;
        }

        public int getA (){
        return a;
        }

        public int getH (){
        return h;
        }


    @Override
    public void countSurfaceArea() {
        int result= ((getA()* getH()/2));
        System.out.println(result + " cm2");
    }

    @Override
    public void countCircuit() {
        System.out.println("utknęłam przy wyliczaniu pierwiastka z boku c trójkąta <facepalm>");
    }


}

