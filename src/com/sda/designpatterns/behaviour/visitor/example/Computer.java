package com.sda.denisbalaceanu.designpatterns.behaviour.visitor.example;

public class Computer implements Item
{
    private final String ram;
    private final String hdd;
    private final String cpu;
    private final int price;

    public Computer(String ram, String hdd, String cpu, int price)
    {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
        this.price = price;
    }

    public String getRam()
    {
        return ram;
    }

    public String getHdd()
    {
        return hdd;
    }

    public String getCpu()
    {
        return cpu;
    }

    public int getPrice()
    {
        return price;
    }

    @Override
    public int accept(ShoppingCart visitor)
    {
        return visitor.visit(this);
    }

}