package com.kodilla.abstracts;

public abstract class Animal {

    private int numberOfLegs;

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public Animal(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }


    public abstract void giveVoice();

}