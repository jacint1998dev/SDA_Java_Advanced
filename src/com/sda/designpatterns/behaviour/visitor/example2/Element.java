package com.sda.denisbalaceanu.designpatterns.behaviour.visitor.example2;

public abstract class Element
{
    public String uuid;

    public Element(String uuid)
    {
        this.uuid = uuid;
    }

    public abstract void accept(Visitor v);
}
