package com.sda.denisbalaceanu.designpatterns.creational.singleton.exercise;

public class Animal
{
    private static Animal instance = null;

    public String type;

    private Animal()
    {
        type = "Dog";
    }

    public static Animal getInstance()
    {
        if (instance == null)
        {
            instance = new Animal();
        }
        return instance;
    }

    @Override
    public String toString()
    {
        return "Animal type: " + type;
    }
}
