package com.sda.denisbalaceanu.designpatterns.creational.abstractfactory.example2;

import com.sda.denisbalaceanu.designpatterns.creational.abstractfactory.example2.model.*;

public class ColorFactory implements AbstractFactory<Color>
{
    @Override
    public Color create(String name)
    {
        if ("Red".equalsIgnoreCase(name))
        {
            return new RedColor();
        }
        else if ("Blue".equalsIgnoreCase(name))
        {
            return new BlueColor();
        }

        return null;
    }
}
