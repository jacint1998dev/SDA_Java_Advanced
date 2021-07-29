package com.sda.denisbalaceanu.designpatterns.creational.prototype.example;

/**
 * One of the ways we can implement this pattern in Java is by using the clone() method. To do this, we'd implement the Cloneable interface.
 *
 * When we're trying to clone, we should decide between making a shallow or a deep copy. Eventually, it boils down to the requirements.
 *
 * For example, if the class contains only primitive and immutable fields, we may use a shallow copy.
 *
 * If it contains references to mutable fields, we should go for a deep copy. We might do that with copy constructors or serialization and deserialization.
 *
 * Let's see how to apply the Prototype pattern without using the Cloneable interface. In order to do this, let's create an abstract class called Tree with an abstract method ‘copy'.
 */
public abstract class Tree
{
    private String position;
    private String mass;
    private double height;

    public Tree(String mass, double height)
    {
        this.mass = mass;
        this.height = height;
    }

    // alternative naming -> public abstract Tree clone();
    public abstract Tree copy();

    public String getPosition()
    {
        return position;
    }

    public void setPosition(String position)
    {
        this.position = position;
    }

    public String getMass()
    {
        return mass;
    }

    public void setMass(String mass)
    {
        this.mass = mass;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }
}
