package com.sda.denisbalaceanu.designpatterns.behaviour.mediator.example.after;

public class Fan {
    private Mediator mediator;
    private boolean isOn = false;

    public void turnOn() {
        mediator.start();
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
        mediator.stop();
    }

    public Mediator getMediator()
    {
        return mediator;
    }

    public void setMediator(Mediator mediator)
    {
        this.mediator = mediator;
    }

    public boolean isOn()
    {
        return isOn;
    }

    public void setOn(boolean on)
    {
        isOn = on;
    }
}
