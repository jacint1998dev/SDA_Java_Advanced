package com.sda.denisbalaceanu.designpatterns.behaviour.command.example;

public class Controler
{
    private CommandInterface command;

    public void setCommand(CommandInterface command)
    {
        this.command = command;
    }

    public void runSort()
    {
        command.execute();
    }

}
