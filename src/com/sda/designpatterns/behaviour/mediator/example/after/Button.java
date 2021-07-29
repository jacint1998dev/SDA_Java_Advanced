package com.sda.denisbalaceanu.designpatterns.behaviour.mediator.example.after;

public class Button {
    private Mediator mediator;

    public void press() {
        mediator.press();
    }

    public Mediator getMediator()
    {
        return mediator;
    }

    public void setMediator(Mediator mediator)
    {
        this.mediator = mediator;
    }
}
