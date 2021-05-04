package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(6, 4);
        rectangle.countSurfaceArea();
        rectangle.countCircuit();

        Triangle triangle = new Triangle(4, 10);
        triangle.countSurfaceArea();
        triangle.countCircuit();

        Circle circle = new Circle(6);
        circle.countSurfaceArea();
        circle.countCircuit();
    }

}
