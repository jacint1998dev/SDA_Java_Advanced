package com.sda.denisbalaceanu.designpatterns.creational.abstractfactory.example2;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(FactoryProvider.getFactory("animal").create("dog"));
    }
}
