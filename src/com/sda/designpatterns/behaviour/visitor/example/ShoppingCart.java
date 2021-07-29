package com.sda.denisbalaceanu.designpatterns.behaviour.visitor.example;

import com.sda.denisbalaceanu.designpatterns.behaviour.visitor.exercise.Animal;

public interface ShoppingCart
{
    int visit(Car car);

    int visit(Computer computer);

    int visit(Animal animal);
}