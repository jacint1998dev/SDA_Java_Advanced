package com.sda.denisbalaceanu.designpatterns.creational.prototype.example;

public class PlasticTree extends Tree {


    public PlasticTree(String mass, double height)
    {
        super(mass, height);
    }

    @Override
    public Tree copy() {
        PlasticTree plasticTreeClone = new PlasticTree(this.getMass(), this.getHeight());
        plasticTreeClone.setPosition(this.getPosition());
        return plasticTreeClone;
    }

}
