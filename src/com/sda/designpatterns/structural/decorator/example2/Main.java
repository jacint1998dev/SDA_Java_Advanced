package com.sda.denisbalaceanu.designpatterns.structural.decorator.example2;

public class Main
{
    public static void main(String[] args)
    {
        ChristmasTree christmasTree = new ChristmasTreeImpl();
        System.out.println(christmasTree.getDecoration());

        ChristmasTree christmasTreeDecorated = new BubbleLightsChristmasTree(christmasTree);
        System.out.println(christmasTreeDecorated.getDecoration());
    }
}
