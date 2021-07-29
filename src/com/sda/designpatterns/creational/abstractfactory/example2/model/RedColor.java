package com.sda.denisbalaceanu.designpatterns.creational.abstractfactory.example2.model;

public class RedColor implements Color
{
    @Override
    public String getName()
    {
        return "Red";
    }

    @Override
    public String toString()
    {
        return "RED COLOR";
    }
}
