package com.sda.denisbalaceanu.designpatterns.behaviour.visitor.exercise;

import com.sda.denisbalaceanu.designpatterns.behaviour.visitor.example.Item;
import com.sda.denisbalaceanu.designpatterns.behaviour.visitor.example.ShoppingCart;

public class Animal implements Item
{
    private final String type;
    private final int price;

    public Animal(String type, int price)
    {
        this.type = type;
        this.price = price;
    }

    public String getType()
    {
        return this.type;
    }

    public int getPrice()
    {
        return this.price;
    }

    @Override
    public int accept(ShoppingCart visitor)
    {
        return visitor.visit(this);
    }
}
