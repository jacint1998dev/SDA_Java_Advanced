package com.sda.design_patterns.ex1;

public class Main {
    public static void main(String[] args) {

        Car basicCar = new OffRoadCar();
        Car carDecorator = new SportsCar(basicCar);
        carDecorator.assemble();
    }
}
