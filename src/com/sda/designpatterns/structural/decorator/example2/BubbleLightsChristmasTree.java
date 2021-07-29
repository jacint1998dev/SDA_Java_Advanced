package com.sda.denisbalaceanu.designpatterns.structural.decorator.example2;

public class BubbleLightsChristmasTree extends TreeDecorator
{
    public BubbleLightsChristmasTree(ChristmasTree tree)
    {
        super(tree);
    }

    @Override
    public String getDecoration()
    {
        return super.getDecoration() + decorateWithBubbleLights();
    }

    private String decorateWithBubbleLights()
    {
        return " with Bubble Lights";
    }
}
