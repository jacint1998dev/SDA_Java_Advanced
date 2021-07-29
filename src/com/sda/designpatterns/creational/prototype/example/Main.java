package com.sda.denisbalaceanu.designpatterns.creational.prototype.example;

public class Main
{

    public static void main(String[] args)
    {
        Tree prototype = new PlasticTree("GREEN", 125);
        prototype.setPosition("12 46 67");

        Tree tree1 = prototype.copy();
        tree1.setPosition("13 88 99");
    }

}
