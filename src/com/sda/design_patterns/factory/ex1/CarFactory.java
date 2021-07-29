package com.sda.design_patterns.factory.ex1;

public class CarFactory {
    public static Car getCar(String model){
        switch (model){
            case "Fiesta":
                return new FordFiesta();
            case "Ka":
                return new FordKa();
            default:
                throw new IllegalArgumentException("No Car");
        }
    }

}
