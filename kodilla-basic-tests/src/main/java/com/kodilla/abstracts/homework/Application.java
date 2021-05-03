package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(6, 4, 0);
        rectangle.countSurfaceArea();
        rectangle.countCircuit();

        Triangle triangle = new Triangle(4, 10, 0);
        triangle.countSurfaceArea();
        triangle.countCircuit();

        Circle circle = new Circle(6, 0, 3.1415);
        circle.countSurfaceArea();
        circle.countCircuit();
    }

}
