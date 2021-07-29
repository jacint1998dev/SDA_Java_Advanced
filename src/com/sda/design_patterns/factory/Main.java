package com.sda.design_patterns.factory;

import com.sda.design_patterns.factory.ex1.Car;
import com.sda.design_patterns.factory.ex1.CarFactory;

public class Main {
    public static void main(String[] args) {
        Car car = CarFactory.getCar("Duster");
        System.out.println(car.getModel());
    }
}
