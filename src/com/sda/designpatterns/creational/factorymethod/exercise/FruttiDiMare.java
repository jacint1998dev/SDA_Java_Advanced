package com.sda.denisbalaceanu.designpatterns.creational.factorymethod.exercise;

import com.sda.denisbalaceanu.designpatterns.creational.factorymethod.example.Pizza;

public class FruttiDiMare implements Pizza
{

    @Override
    public String getDetectedPizza()
    {
        return "3. Frutti di Mare";
    }
}
