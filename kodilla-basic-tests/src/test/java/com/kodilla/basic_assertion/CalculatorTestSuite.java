package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubstract(){
        Calculator calculator = new Calculator();
        int a = 7;
        int b = 2;
        int substractResult = calculator.substract(a, b);
        assertEquals(5, substractResult);
    }

    @Test
    public void testTwoSquaredWithPositiveNumber (){
        Calculator calculator = new Calculator();
        int a = 6;
        int twoSquaredResult = calculator.twoSquared(a);
        assertEquals(36, twoSquaredResult);
    }

    @Test
    public void testTwoSquaredWithNegativeNumber (){
        Calculator calculator = new Calculator();
        int a = -6;
        int twoSquaredResult = calculator.twoSquared(a);
        assertEquals(36, twoSquaredResult);
    }

    @Test
    public void testTwoSquaredWithZero (){
        Calculator calculator = new Calculator();
        int a = 0;
        int twoSquaredResult = calculator.twoSquared(a);
        assertEquals(0, twoSquaredResult);
    }
}
