package com.sda.java_advanced_coding.exercises.ex21;

public class Qube extends Shape3D {

    private double length;

    public Qube(double length) {
        this.length = length;
    }

    @Override
    double calculatePerimeter() {
        return (length +length) * 12;
    }

    @Override
    double calculateArea() {
        return length * length * 6;
    }

    @Override
    double calculateVolume() {
        return Math.pow(length,3);
    }

    @Override
    public String toString() {
        return "Qube{" +
                "length=" + length +
                "} " + super.toString();
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
