package com.sda.denisbalaceanu.designpatterns.structural.bridge.example;

public class Square extends Shape
{
    public Square(Color color)
    {
        super(color);
    }

    @Override
    public String draw()
    {
        return "Square drawn. " + color.fill();
    }
}
