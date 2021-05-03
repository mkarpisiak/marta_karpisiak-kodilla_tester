package com.kodilla.basic_assertion;


public class Application2 {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b); // przypisanie rezultatu do zmiennej
        boolean correct = ResultChecker.assertEquals(13, sumResult);// metoda z klasy ResultChecker
        //wynik porównania przypisujemy do zmiennej correct
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int substractResult = calculator.substract(a, b);
        boolean correct2 = ResultChecker.assertEquals(-3, substractResult);
        if (correct2) {
            System.out.println("Metoda substract działa poprawnie dla liczb " + a + " i " + b);

        } else {
            System.out.println("Metoda substract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int twoSquaredResult = calculator.twoSquared(a);
        boolean correct3 = ResultChecker.assertEquals(25, twoSquaredResult);
        if (correct3){
            System.out.println("Metoda twoSquared działa poprawnie dla liczby " + a );

        } else {
            System.out.println("Metoda twoSquared nie działa poprawnie dla liczby " + a);
        }
    }
}

