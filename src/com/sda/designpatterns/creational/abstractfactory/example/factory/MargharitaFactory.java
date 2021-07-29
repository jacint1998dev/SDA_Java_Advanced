package com.sda.denisbalaceanu.designpatterns.creational.abstractfactory.example.factory;

import com.sda.denisbalaceanu.designpatterns.creational.abstractfactory.example.pizza.Margharita;
import com.sda.denisbalaceanu.designpatterns.creational.abstractfactory.example.pizza.Pizza;

public class MargharitaFactory implements PizzaAbstractFactory
{

    @Override
    public Pizza create(int size)
    {
        return new Margharita(size);
    }
}
