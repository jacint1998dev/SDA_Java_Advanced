package com.sda.denisbalaceanu.designpatterns.structural.decorator.exercise;

import com.sda.denisbalaceanu.designpatterns.structural.decorator.example.Pizza;
import com.sda.denisbalaceanu.designpatterns.structural.decorator.example.PizzaDecorator;

public class SeafoodPizza extends PizzaDecorator
{

    public SeafoodPizza(Pizza pizza)
    {
        super(pizza);
        super.addIngredients("Seafood");
    }

    @Override
    public void printIngredients()
    {
        super.printIngredients();
    }
}
