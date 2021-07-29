package com.sda.denisbalaceanu.designpatterns.structural.flueniInterface.example;

import java.util.List;

public interface Menu
{
    Menu orderPizza(List<Integer> orders);

    Menu eatPizza();

    Menu payPizza();

    Pizza getPizza(int index);
}
