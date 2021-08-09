package com.sda.java_advanced_coding.exercises.ex20;

public class Main {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(11.5, 20.0);
        Shape triangle = new Triangle(10.0, 12.0, 5.0);

        System.out.println("Rectangle");
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());

        System.out.println("Triangle");
        System.out.println(triangle.calculatePerimeter());
        System.out.println(triangle.calculateArea());
    }
}
