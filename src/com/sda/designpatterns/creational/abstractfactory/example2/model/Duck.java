package com.sda.denisbalaceanu.designpatterns.creational.abstractfactory.example2.model;

public class Duck implements Animal
{

    @Override
    public String getAnimal()
    {
        return "Duck";
    }

    @Override
    public String makeSound()
    {
        return "Squeks";
    }
}
