package com.sda.denisbalaceanu.designpatterns.structural.adapter.example;

public class BugattiVeyron implements Movable
{
    @Override
    // returns speed in MPH
    public double getSpeed()
    {
        return 268;
    }
}
