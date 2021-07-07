package com.sda.abstractclassadvanced;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        super(4);
        this.length=length;
        this.width=width;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return 2* (length+width);
    }
}
