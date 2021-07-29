package com.sda.denisbalaceanu.designpatterns.structural.adapter.example;

public class Main
{
    public static void main(String[] args)
    {
        Movable bugattiVeyron = new BugattiVeyron();
        System.out.println(bugattiVeyron.getSpeed() + "MPH");

        MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
        System.out.println(bugattiVeyronAdapter.getSpeed() + "KMH");
    }
}
