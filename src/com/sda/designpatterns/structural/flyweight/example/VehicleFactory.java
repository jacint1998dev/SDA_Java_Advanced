package com.sda.denisbalaceanu.designpatterns.structural.flyweight.example;

import java.util.HashMap;
import java.util.Map;

public class VehicleFactory
{
    private static Map<Color, Vehicle> vehiclesCache = new HashMap<>();

    public static Vehicle createVehicle(Color color)
    {
        Vehicle newVehicle = vehiclesCache.computeIfAbsent(color, newColor ->
        {
            Engine newEngine = new Engine();
            return new Car(newEngine, newColor);
        });
        return newVehicle;
    }
}
