package com.sda.denisbalaceanu.designpatterns.creational.abstractfactory.example.factory;


import com.sda.denisbalaceanu.designpatterns.creational.abstractfactory.example.pizza.Pizza;

public interface PizzaAbstractFactory
{
    Pizza create(int size);
}

