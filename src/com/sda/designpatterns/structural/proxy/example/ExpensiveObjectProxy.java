package com.sda.denisbalaceanu.designpatterns.structural.proxy.example;

public class ExpensiveObjectProxy implements ExpensiveObject
{
    private static ExpensiveObject object;

    @Override
    public void process()
    {
        if (object == null)
        {
            object = new ExpensiveObjectImpl();
        }
        object.process();
    }
}