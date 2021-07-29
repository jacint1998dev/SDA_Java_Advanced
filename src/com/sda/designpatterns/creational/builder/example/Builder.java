package com.sda.denisbalaceanu.designpatterns.creational.builder.example;

public class Builder
{

    public static void main(String[] args)
    {
        Pizza margharita = new Pizza.Builder("Margharita", 50)
                .addChees(false)
                .addSauce(true)
                .takeaway(true)
                .build();

        Pizza capriciosa = new Pizza.Builder("Capriciosa", 42)
                .addChees(true)
                .addSauce(false)
                .takeaway(false)
                .build();

        System.out.println(margharita);
        System.out.println(capriciosa);

        //Block square = new Block.BlockBuilder("Square").setShape("Square").setColor(Color.RED).setPenWidth(10).build();
        //Block circle = new Block.BlockBuilder("Circle").setColor(Color.GREEN).setPenWidth(20).build();
        //System.out.println(square);
        //System.out.println(circle);
    }
}
