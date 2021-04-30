package com.kodilla.inheritance;

public class AppOpSystem {
    public static void main(String[] args) {
        Windows10 windows10 = new Windows10(2015);
        windows10.turnOn();

        Windows7 windows7 = new Windows7(2009);
        windows7.turnOf();
    }
}
