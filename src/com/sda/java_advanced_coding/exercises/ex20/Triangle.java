package com.sda.java_advanced_coding.exercises.ex20;

public class Triangle extends Shape {

    private double hypotenuse;
    private double height;
    private double base;

    public Triangle(double hypotenuse, double height, double base) {
        this.hypotenuse = hypotenuse;
        this.height = height;
        this.base = base;
    }

    @Override
    double calculatePerimeter() {

        return base + height + hypotenuse;

    }

    @Override
    double calculateArea() {
        return (base * height) / 2;

    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "hypotenuse=" + hypotenuse +
                ", height=" + height +
                ", base=" + base +
                "} " + super.toString();
    }
}
