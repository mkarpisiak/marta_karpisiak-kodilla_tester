package com.kodilla.collections.homework;

public class CarRace {
    public static void main(String[] args) {


        Audi audi = new Audi(0);
        doRace(audi);

        Lexus lexus = new Lexus(0);
        doRace(lexus);

        VW vw = new VW(0);
        doRace(vw);
    }
   public static void doRace (Car car){
            car.increaseSpeed();
            car.increaseSpeed();
            car.increaseSpeed();
            car.decreaseSpeed();
            car.decreaseSpeed();
       System.out.println(car.getSpeed());
    }

    }

