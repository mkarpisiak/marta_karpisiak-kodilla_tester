package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.homework.Car;

public class CarUtils {

    public static void describeCar(Car car){
        System.out.println("Speed of this car is " + car.getSpeed() + "km/h.");
        System.out.println("You can increase to "+ car.increaseSpeed() + "km/h very easy.");
        System.out.println("Someone said girls like fast cars.");
    }

}
