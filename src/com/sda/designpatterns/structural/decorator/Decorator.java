package com.sda.denisbalaceanu.designpatterns.structural.decorator;

import com.sda.denisbalaceanu.designpatterns.structural.decorator.example.BasicPizza;
import com.sda.denisbalaceanu.designpatterns.structural.decorator.example.HamPizza;
import com.sda.denisbalaceanu.designpatterns.structural.decorator.example.MushroomsPizza;
import com.sda.denisbalaceanu.designpatterns.structural.decorator.example.Pizza;

public class Decorator
{
    public static void main(String[] args)
    {
        Pizza pizza = new BasicPizza();
        pizza.printIngredients();
        Pizza hamPizza = new HamPizza(pizza);
        pizza.printIngredients();
        Pizza mushroomsPizza = new MushroomsPizza(pizza);
        pizza.printIngredients();

//        Pizza seafoodPizza = new SeafoodPizza(new BasicPizza());
//        pizza.printIngredients();
    }
}