package com.sda.design_patterns.factory.ex1;

public class FordFiesta implements Car{
    @Override
    public String getModel() {
        return "Fiesta";
    }

    @Override
    public String getEngineCapacity() {
        return "1400";
    }
}
