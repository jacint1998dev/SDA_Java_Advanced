package com.sda.denisbalaceanu.designpatterns.structural.proxy.exercise2;

public class BankAccountProxy implements BankAccount
{
    private BankAccount bankAccount;

    public BankAccountProxy(BankAccount bankAccount)
    {
        this.bankAccount = bankAccount;
    }

    @Override
    public Double viewAmount()
    {
        return bankAccount.viewAmount();
    }

    @Override
    public void getAllMoney()
    {
        throw new IllegalStateException("Operation not supported!");
    }

    @Override
    public void addMoney()
    {
        throw new IllegalStateException("Operation not supported!");
    }
}
