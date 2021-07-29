package com.sda.denisbalaceanu.designpatterns.creational.abstractfactory.example2;

import com.sda.denisbalaceanu.designpatterns.creational.abstractfactory.example2.model.Animal;
import com.sda.denisbalaceanu.designpatterns.creational.abstractfactory.example2.model.Dog;
import com.sda.denisbalaceanu.designpatterns.creational.abstractfactory.example2.model.Duck;

public class AnimalFactory implements AbstractFactory<Animal>
{

    @Override
    public Animal create(String name)
    {
        if ("Dog".equalsIgnoreCase(name))
        {
            return new Dog();
        }
        else if ("Duck".equalsIgnoreCase(name))
        {
            return new Duck();
        }

        return null;
    }

}
