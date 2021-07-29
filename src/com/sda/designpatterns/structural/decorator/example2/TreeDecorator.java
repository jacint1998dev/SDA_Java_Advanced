package com.sda.denisbalaceanu.designpatterns.structural.decorator.example2;

public abstract class TreeDecorator implements ChristmasTree
{
    private ChristmasTree tree;

    public TreeDecorator(ChristmasTree tree)
    {
        this.tree = tree;
    }

    @Override
    public String getDecoration()
    {
        return tree.getDecoration();
    }
}
