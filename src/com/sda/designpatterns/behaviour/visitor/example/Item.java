package com.sda.denisbalaceanu.designpatterns.behaviour.visitor.example;

public interface Item
{
    int accept(ShoppingCart visitor);
}