package com.sda.denisbalaceanu.designpatterns.creational.singleton.exampleeager;

public class Pizza
{
    //EAGER INITIALIZATION
    private static final Pizza instance = new Pizza("Margharita");

    public String name;

    public static Pizza getInstance()
    {
        return instance;
    }

    private Pizza(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Pizza name: " + name;
    }
}