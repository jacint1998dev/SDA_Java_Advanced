package com.sda.java_advanced.abstractclassadvanced;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        super(1);
        this.radius=radius;
    }


    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
