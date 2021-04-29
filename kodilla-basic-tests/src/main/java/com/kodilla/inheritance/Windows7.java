package com.kodilla.inheritance;

public class Windows7 extends OperatingSystem {

    public Windows7 (int year){
        super(year);

    }
    @Override
    public void turnOn() {

        System.out.println("Windows 7 was turned on");
    }
    @Override
    public void turnOf() {

        System.out.println("Windows 7 was turned of");
    }

}
