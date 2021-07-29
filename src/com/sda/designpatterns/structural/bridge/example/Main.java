package com.sda.denisbalaceanu.designpatterns.structural.bridge.example;

public class Main
{
    public static void main(String[] args)
    {
        Shape square = new Square(new Blue());

        Shape square2 = new Square(new Red());
        System.out.println(square2.draw());
    }

}
