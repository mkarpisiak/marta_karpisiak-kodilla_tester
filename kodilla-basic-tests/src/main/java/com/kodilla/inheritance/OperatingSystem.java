package com.kodilla.inheritance;

public abstract class OperatingSystem {
    private int year;

    public OperatingSystem(int year){
        this.year= year;
    }

    public int getYear(){
        return year;
    }

    public void turnOn() {

        System.out.println("System was turned on.");
    }

    public void turnOf() {

        System.out.println("System was turned of");
    }


}
