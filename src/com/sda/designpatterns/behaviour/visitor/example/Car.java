package com.sda.denisbalaceanu.designpatterns.behaviour.visitor.example;

public class Car implements Item
{
    private final String brand;
    private final String color;
    private final int price;

    public Car(String brand, String color, int price)
    {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public String getBrand()
    {
        return brand;
    }

    public String getColor()
    {
        return color;
    }

    public int getPrice()
    {
        return price;
    }

    @Override
    public int accept(ShoppingCart visitor)
    {
        return visitor.visit(this);
    }

}