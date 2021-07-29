package com.sda.denisbalaceanu.designpatterns.structural.flyweight.example;

public class Car implements Vehicle
{
    private Engine engine;
    private Color color;

    public Car(Engine engine, Color color)
    {
        this.engine = engine;
        this.color = color;
    }

    @Override
    public void start()
    {

    }

    @Override
    public void stop()
    {

    }

    public Engine getEngine()
    {
        return engine;
    }

    public void setEngine(Engine engine)
    {
        this.engine = engine;
    }

    public Color getColor()
    {
        return color;
    }

    public void setColor(Color color)
    {
        this.color = color;
    }
}
