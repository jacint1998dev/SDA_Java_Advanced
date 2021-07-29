package com.sda.denisbalaceanu.designpatterns.behaviour.mediator.example.before;

public class Main
{
    public static void main(String[] args)
    {
        Button button = new Button();
        PowerSupplier powerSupplier = new PowerSupplier();
        Fan fan = new Fan(button, powerSupplier);
        button.setFan(fan);

        System.out.println(fan.isOn());

        button.press();

        System.out.println(fan.isOn());

        button.press();

        System.out.println(fan.isOn());
    }
}
