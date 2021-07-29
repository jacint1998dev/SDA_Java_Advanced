package com.sda.denisbalaceanu.designpatterns.structural.bridge.beforebridge;

public class SquareBlue implements Shape
{
    @Override
    public String draw()
    {
        return "This is a square" + getColor();
    }

    @Override
    public String getColor()
    {
        return "Blue";
    }
}
