package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.arrays.ShapeUtils;
import com.kodilla.collections.homework.Audi;
import com.kodilla.collections.homework.Car;
import com.kodilla.collections.homework.Lexus;
import com.kodilla.collections.homework.VW;
import com.kodilla.collections.interfaces.Shape;

import java.util.Random;

public class CarsApplication {

    public static Car drawCar() {
        Random random = new Random();
        int number = random.nextInt(3);
        int speed = random.nextInt(101);


        if (number == 0) {
            return new Audi(speed);
        } else if (number == 1) {
            return new Lexus(speed);
        } else {
            return new VW(speed);
        }


    }

    public static void main(String[] args) {

          Random random = new Random();
          int size= random.nextInt(16);

        Car [] cars= new Car[size];
        for (int i=0; i<size; i++)
            cars[i] = drawCar();
        for (Car car :cars)
            CarUtils.describeCar(car);
        }

    }



