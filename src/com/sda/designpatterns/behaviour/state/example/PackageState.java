package com.sda.denisbalaceanu.designpatterns.behaviour.state.example;

public interface PackageState
{
    void next(Package pkg);

    void prev(Package pkg);

    void printStatus();
}
