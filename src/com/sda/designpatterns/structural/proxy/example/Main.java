package com.sda.denisbalaceanu.designpatterns.structural.proxy.example;

public class Main
{
    public static void main(String[] args)
    {
        ExpensiveObject object = new ExpensiveObjectProxy();
        object.process();
        object.process();
    }
}
