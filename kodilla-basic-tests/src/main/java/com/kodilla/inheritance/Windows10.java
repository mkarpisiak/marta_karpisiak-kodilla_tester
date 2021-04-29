package com.kodilla.inheritance;

public class Windows10 extends OperatingSystem{

    public Windows10 (int year){
        super(year);

    }
    @Override
    public void turnOn() {

        System.out.println("Windows 10 was turned on.");
    }
    @Override
    public void turnOf() {

        System.out.println("Windows 10 was turned of.");
    }
}
