package com.sda.denisbalaceanu.designpatterns.structural.proxy.exercise2;

public class BankAccountImpl implements BankAccount
{
    @Override
    public Double viewAmount()
    {
        return 221321231.0;
    }

    @Override
    public void getAllMoney()
    {
        System.out.println("Get all money from bank account");
    }

    @Override
    public void addMoney()
    {
        System.out.println("Add money");
    }
}
