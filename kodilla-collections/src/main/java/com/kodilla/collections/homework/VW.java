package com.kodilla.collections.homework;

public class VW implements Car{
    private int speed;


    public VW (int speed){
        this.speed= speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int increaseSpeed() {
        speed = speed + 15;
    return speed;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 15;
    }
}
