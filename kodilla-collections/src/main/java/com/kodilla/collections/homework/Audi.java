package com.kodilla.collections.homework;

public class Audi implements Car{

    private int speed;

    public Audi (int speed){
        this.speed= speed;
    }
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
    speed = speed + 25;
    }

    @Override
    public void decreaseSpeed() {
    speed = speed - 35;
    }
}
