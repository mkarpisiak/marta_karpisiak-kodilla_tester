package com.kodilla.collections.homework;

public class Lexus implements Car{

    private int speed;


    public Lexus (int speed){
        this.speed= speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + 30;

    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 30;

    }
}
