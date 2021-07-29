package com.sda.denisbalaceanu.designpatterns.creational.abstractfactory.example2.model;

public class Dog implements Animal
{
    @Override
    public String getAnimal()
    {
        return "Dog";
    }

    @Override
    public String makeSound()
    {
        return "HAM";
    }

    @Override
    public String toString()
    {
        return "DOG";
    }
}
