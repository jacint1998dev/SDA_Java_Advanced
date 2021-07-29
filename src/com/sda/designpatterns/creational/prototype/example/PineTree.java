package com.sda.denisbalaceanu.designpatterns.creational.prototype.example;

public class PineTree extends Tree
{
    public PineTree(String mass, double height)
    {
        super(mass, height);
    }

    @Override
    public Tree copy()
    {
        PineTree pineTreeClone = new PineTree(this.getMass(), this.getHeight());
        pineTreeClone.setPosition(this.getPosition());
        return pineTreeClone;
    }
}
