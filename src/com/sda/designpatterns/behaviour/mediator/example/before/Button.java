package com.sda.denisbalaceanu.designpatterns.behaviour.mediator.example.before;

public class Button
{
    private Fan fan;

    public void press()
    {
        if (fan.isOn())
        {
            fan.turnOff();
        } else
        {
            fan.turnOn();
        }
    }

    public Fan getFan()
    {
        return fan;
    }

    public void setFan(Fan fan)
    {
        this.fan = fan;
    }
}
