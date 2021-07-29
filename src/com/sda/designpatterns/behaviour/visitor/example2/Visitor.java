package com.sda.denisbalaceanu.designpatterns.behaviour.visitor.example2;

public interface Visitor
{
    void visit(XmlElement xe);

    void visit(JsonElement je);
}
