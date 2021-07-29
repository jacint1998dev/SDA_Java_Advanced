package com.sda.denisbalaceanu.designpatterns.behaviour.mediator.example.before;

public class Fan
{
    private Button button;
    private PowerSupplier powerSupplier;
    private boolean isOn = false;

    public Fan(Button button, PowerSupplier powerSupplier)
    {
        this.button = button;
        this.powerSupplier = powerSupplier;
    }

    public void turnOn()
    {
        powerSupplier.turnOn();
        isOn = true;
    }

    public void turnOff()
    {
        isOn = false;
        powerSupplier.turnOff();
    }

    public Button getButton()
    {
        return button;
    }

    public void setButton(Button button)
    {
        this.button = button;
    }

    public PowerSupplier getPowerSupplier()
    {
        return powerSupplier;
    }

    public void setPowerSupplier(PowerSupplier powerSupplier)
    {
        this.powerSupplier = powerSupplier;
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
