package com.sda.denisbalaceanu.designpatterns.structural.proxy.exercise2;

public class Main
{
    public static void main(String[] args)
    {
        BankAccount bankAccount = new BankAccountImpl();
        bankAccount.addMoney();
        bankAccount.getAllMoney();
        System.out.println(bankAccount.viewAmount());
        // operations with bank account

        BankAccount bankAccountProxy = new BankAccountProxy(bankAccount);
        System.out.println(bankAccountProxy.viewAmount());
        bankAccountProxy.getAllMoney();
    }
}
