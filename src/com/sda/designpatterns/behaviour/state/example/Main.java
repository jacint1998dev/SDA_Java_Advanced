package com.sda.denisbalaceanu.designpatterns.behaviour.state.example;

public class Main
{
    public static void main(String[] args)
    {
        Package pkg = new Package();

        pkg.getState().printStatus();
        pkg.nextState();

        pkg.getState().printStatus();
        pkg.nextState();

        pkg.getState().printStatus();
        pkg.nextState();
    }
}
