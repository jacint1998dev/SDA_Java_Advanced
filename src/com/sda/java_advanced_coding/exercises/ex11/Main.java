package com.sda.java_advanced_coding.exercises.ex11;

/**
 * Create a Resizable interface with the resize(double resizeFactor) method.
 * Implement the interface in the class from the previous task (Circle). When calling the resize(double
 * resizeFactor) method, the circle should change its size by a given factor (1.5, 0.5, 10.0, etc.).
 * Validate the resizing by calling the other Circle methods
 */
public class Main {
    public static void main(String[] args) {

        Point2D point1 = new Point2D(12, 30);
        Point2D point2 = new Point2D(15, 35);
        Circle circle = new Circle(point1, point2);
        System.out.println(circle.getRadius());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());

        System.out.println("-----------------");

        MoveDirection moveDirection = new MoveDirection(2, 5);
        circle.move(moveDirection);
        System.out.println(circle.getRadius());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());

        System.out.println("-----------------");

        MoveDirection moveDirection1 = new MoveDirection(3, 6);
        point2.move(moveDirection1);
        System.out.println(circle.getRadius());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());

        System.out.println("-----------------");

        circle.resize(2.0);
        System.out.println(circle.getRadius());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());

    }
}
