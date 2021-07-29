package com.sda.denisbalaceanu.designpatterns.behaviour.visitor.example2;

public class XmlElement extends Element {

    public XmlElement(String uuid) {
        super(uuid);
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}
