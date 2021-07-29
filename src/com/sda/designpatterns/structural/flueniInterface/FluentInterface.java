package com.sda.denisbalaceanu.designpatterns.structural.flueniInterface;

import com.sda.denisbalaceanu.designpatterns.structural.flueniInterface.example.Menu;
import com.sda.denisbalaceanu.designpatterns.structural.flueniInterface.example.Restaurant;
import com.sda.denisbalaceanu.designpatterns.structural.flueniInterface.example.RestaurantImpl;

import java.util.Arrays;

public class FluentInterface
{
    public static void main(String[] args)
    {
        new RestaurantImpl()
                .name("Primavera")
                .getMenu()
                .orderPizza(Arrays.asList(1, 3))
                .eatPizza()
                .payPizza()
                .getPizza(1)
                .printIngredients()
                .printIngredients()
                .printName()
                .getCost();

        Restaurant restaurant = new RestaurantImpl();
        restaurant.name("Primavera");

        Menu menu = restaurant.getMenu();
        menu.orderPizza(Arrays.asList(1, 3));
        menu.eatPizza();
        menu.payPizza();
    }

}
