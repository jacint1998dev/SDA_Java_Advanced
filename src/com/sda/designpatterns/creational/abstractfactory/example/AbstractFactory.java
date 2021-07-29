package com.sda.denisbalaceanu.designpatterns.creational.abstractfactory.example;

import com.sda.denisbalaceanu.designpatterns.creational.abstractfactory.example.factory.PizzaFactory;
import com.sda.denisbalaceanu.designpatterns.creational.abstractfactory.example.pizza.Pizza;

public class AbstractFactory
{

    public static void main(String[] args)
    {
        Pizza margharita = PizzaFactory.createPizza("Margharita", 32);
        Pizza capriciosa = PizzaFactory.createPizza("Capriciosa", 42);
        //Pizza fruttiDiMare = PizzaFactory.createPizza("Frutti di Mare", 32);
        System.out.println(margharita);
        System.out.println(capriciosa);
        //System.out.println(fruttiDiMare);
    }
}
