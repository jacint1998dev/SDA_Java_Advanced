package com.sda.denisbalaceanu.designpatterns.creational.abstractfactory.example.factory;

import com.sda.denisbalaceanu.designpatterns.creational.abstractfactory.example.pizza.Capriciosa;
import com.sda.denisbalaceanu.designpatterns.creational.abstractfactory.example.pizza.Pizza;

public class CapriciosaFactory implements PizzaAbstractFactory
{

    @Override
    public Pizza create(int size)
    {
        return new Capriciosa(size);
    }
}
