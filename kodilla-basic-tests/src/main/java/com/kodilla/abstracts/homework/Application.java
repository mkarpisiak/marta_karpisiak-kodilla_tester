package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.countSurfaceArea();
        rectangle.countCircuit();

        Triangle triangle = new Triangle();
        triangle.countSurfaceArea();
        triangle.countCircuit();

        Circle circle = new Circle();
        circle.countSurfaceArea();
        circle.countCircuit();
    }

}
