package com.sda.design_patterns.factory.ex1;

public class FordKa implements Car {
    @Override
    public String getModel() {
        return "Ka";
    }

    @Override
    public String getEngineCapacity() {
        return "1000";
    }
}
