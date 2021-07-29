package com.sda.denisbalaceanu.designpatterns.behaviour.strategy.example2;

import java.math.BigDecimal;

public class Main
{
    public static void main(String[] args)
    {
        Discounter easterDiscounter = new EasterDiscounter();

        BigDecimal discountedValue = easterDiscounter.applyDiscount(BigDecimal.valueOf(100));
        System.out.println(discountedValue);
    }
}
