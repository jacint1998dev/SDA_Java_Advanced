package com.sda.denisbalaceanu.designpatterns.creational.abstractfactory.example.factory;

import com.sda.denisbalaceanu.designpatterns.creational.abstractfactory.example.pizza.Pizza;
import com.sda.denisbalaceanu.designpatterns.creational.abstractfactory.exercise.factories.FruttiDiMareFactory;

public class PizzaFactory
{

    public static Pizza createPizza(String type, int size)
    {
        Pizza pizza;
        switch (type)
        {
            case "Margharita":
                pizza = new MargharitaFactory().create(size);
                break;
            case "Capriciosa":
                pizza = new CapriciosaFactory().create(size);
                break;
            case "Frutti di Mare":
                pizza = new FruttiDiMareFactory().create(size);
                break;
            default:
                pizza = null;
                break;
        }
        return pizza;
    }
}
