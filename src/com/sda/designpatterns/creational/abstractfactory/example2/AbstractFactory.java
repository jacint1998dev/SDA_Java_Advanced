package com.sda.denisbalaceanu.designpatterns.creational.abstractfactory.example2;

public interface AbstractFactory<T>
{
    T create(String name);
}
