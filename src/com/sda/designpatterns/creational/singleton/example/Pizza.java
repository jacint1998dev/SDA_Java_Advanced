package com.sda.denisbalaceanu.designpatterns.creational.singleton.example;

import com.sda.denisbalaceanu.designpatterns.creational.singleton.doublecheck.Food;

public class Pizza extends Food
{
    // LAZY INITIALIZATION
    private static Pizza instance = null;

    public String name;

    public static Pizza getInstance()
    {
        if (instance == null)
        {
            instance = new Pizza("Margharita");
        }
        return instance;
    }

    private Pizza(String name)
    {
        this.name = name;
        setPrice("120");
    }

    @Override
    public String toString()
    {
        return "Pizza name: " + name;
    }
}