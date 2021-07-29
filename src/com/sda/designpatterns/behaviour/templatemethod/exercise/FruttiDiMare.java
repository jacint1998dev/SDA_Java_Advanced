package com.sda.denisbalaceanu.designpatterns.behaviour.templatemethod.exercise;

import com.sda.denisbalaceanu.designpatterns.behaviour.templatemethod.example.Pizza;

public class FruttiDiMare extends Pizza
{

    @Override
    protected void addIngredients()
    {
        System.out.println("Frutti di Mare");
        System.out.println("Add ingredients: Tomato Sauce, Chees, Seafood");
    }
}
