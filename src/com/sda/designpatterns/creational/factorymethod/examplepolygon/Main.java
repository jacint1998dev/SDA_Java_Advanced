package com.sda.denisbalaceanu.designpatterns.creational.factorymethod.examplepolygon;

public class Main
{
    public static void main(String[] args)
    {
        Polygon polygon = PolygonFactory.getPolygon(388);
        System.out.println(polygon.getType());
    }
}
