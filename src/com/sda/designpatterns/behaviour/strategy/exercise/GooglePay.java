package com.sda.denisbalaceanu.designpatterns.behaviour.strategy.exercise;

import com.sda.denisbalaceanu.designpatterns.behaviour.strategy.example.Payment;

public class GooglePay implements Payment
{
    private final String email;
    private final String pass;

    public GooglePay(String email, String pass)
    {
        this.email = email;
        this.pass = pass;
    }

    @Override
    public void pay(int amount)
    {
        System.out.println("Cost: " + (amount * 0.9) + "$, paid whit GooglePay");
    }
}
