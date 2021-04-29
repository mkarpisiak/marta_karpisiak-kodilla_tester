package com.kodilla.inheritance;

public abstract class OperatingSystem {
    public int year;

    public OperatingSystem(int year){
        this.year= year;
    }

    public void Year (int year){

        System.out.println("this system was released in " + year);
    }

    public void turnOn() {

        System.out.println("System was turned on.");
    }

    public void turnOf() {

        System.out.println("System was turned of");
    }


}
