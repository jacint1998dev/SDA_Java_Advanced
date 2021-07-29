package com.sda.denisbalaceanu.designpatterns.behaviour.visitor.example2;

public class JsonElement extends Element {

    public JsonElement(String uuid) {
        super(uuid);
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}