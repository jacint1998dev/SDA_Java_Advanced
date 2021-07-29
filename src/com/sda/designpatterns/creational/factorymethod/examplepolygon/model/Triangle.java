package com.sda.denisbalaceanu.designpatterns.creational.factorymethod.examplepolygon.model;

import com.sda.denisbalaceanu.designpatterns.creational.factorymethod.examplepolygon.Polygon;

public class Triangle implements Polygon
{
    @Override
    public String getType()
    {
        return "Triangle";
    }
}
