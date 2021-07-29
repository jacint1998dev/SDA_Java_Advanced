package com.sda.denisbalaceanu.designpatterns.creational.factorymethod.examplepolygon;

import com.sda.denisbalaceanu.designpatterns.creational.factorymethod.examplepolygon.model.*;

public class PolygonFactory
{
    public static Polygon getPolygon(int numberOfSides)
    {
        if (numberOfSides == 3)
        {
            return new Triangle();
        }
        if (numberOfSides == 4)
        {
            return new Square();
        }
        if (numberOfSides == 5)
        {
            return new Pentagon();
        }
        if (numberOfSides == 7)
        {
            return new Heptagon();
        }
        else if (numberOfSides == 8)
        {
            return new Octagon();
        }
        //return null;
        throw new IllegalArgumentException("Factory could not create a polygon with " + numberOfSides + " number of sides!");
    }
}
