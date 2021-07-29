package com.sda.denisbalaceanu.designpatterns.creational.singleton.doublecheck;

public class Pizza extends Food
{
    // DOUBLE CHECK INITIALIZATION
    private static Pizza instance = null;

    public String name;

    public static Pizza getInstance()
    {
        if (instance == null)
        {
            synchronized (Pizza.class)
            {
                if (instance == null)
                {
                    instance = new Pizza("Margharita");
                }
            }
        }
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