package com.sda.denisbalaceanu.designpatterns.creational.abstractfactory.exercise.factories;

import com.sda.denisbalaceanu.designpatterns.creational.abstractfactory.example.factory.PizzaAbstractFactory;
import com.sda.denisbalaceanu.designpatterns.creational.abstractfactory.example.pizza.Pizza;
import com.sda.denisbalaceanu.designpatterns.creational.abstractfactory.exercise.pizza.FruttiDiMare;

public class FruttiDiMareFactory implements PizzaAbstractFactory
{
    @Override
    public Pizza create(int size)
    {
        return new FruttiDiMare(size);
    }
}
