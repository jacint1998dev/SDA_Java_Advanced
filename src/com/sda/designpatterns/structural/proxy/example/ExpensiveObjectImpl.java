package com.sda.denisbalaceanu.designpatterns.structural.proxy.example;

public class ExpensiveObjectImpl implements ExpensiveObject
{
    public ExpensiveObjectImpl()
    {
        heavyInitialConfiguration();
    }

    @Override
    public void process()
    {
        System.out.println("Processing complete.");
    }

    private void heavyInitialConfiguration()
    {
        System.out.println("Loading initial configuration...");
    }

}
