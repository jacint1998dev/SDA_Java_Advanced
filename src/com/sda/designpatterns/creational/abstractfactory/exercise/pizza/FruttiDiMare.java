package com.sda.denisbalaceanu.designpatterns.creational.abstractfactory.exercise.pizza;

import com.sda.denisbalaceanu.designpatterns.creational.abstractfactory.example.pizza.Pizza;

public class FruttiDiMare extends Pizza
{
    private final int size;

    public FruttiDiMare(int size)
    {
        this.size = size;
    }

    @Override
    public String getName()
    {
        return "Frutti di Mare";
    }

    @Override
    public int getSize()
    {
        return size;
    }

    @Override
    public String getIngredients()
    {
        return "Chees, Tomato Sauce, Seafood";
    }
}
