package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.homework.Audi;
import com.kodilla.collections.homework.Car;
import com.kodilla.collections.homework.Lexus;
import com.kodilla.collections.homework.VW;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Lexus(250));
        cars.add(new Audi(215));
        cars.add(new VW(210));

        cars.remove(0);

        Lexus lexus = new Lexus(250);
        cars.add(lexus);
        cars.remove(lexus);

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }

    }
}


