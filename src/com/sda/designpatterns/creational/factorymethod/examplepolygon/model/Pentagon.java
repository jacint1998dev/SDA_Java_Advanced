package com.sda.denisbalaceanu.designpatterns.creational.factorymethod.examplepolygon.model;

import com.sda.denisbalaceanu.designpatterns.creational.factorymethod.examplepolygon.Polygon;

public class Pentagon implements Polygon
{
    @Override
    public String getType()
    {
        return "Pentagon";
    }
}
