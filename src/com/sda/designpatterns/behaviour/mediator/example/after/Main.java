package com.sda.denisbalaceanu.designpatterns.behaviour.mediator.example.after;


public class Main
{
    public static void main(String[] args)
    {
        Button button = new Button();
        PowerSupplier powerSupplier = new PowerSupplier();
        Fan fan = new Fan();

        Mediator mediator = new Mediator(button, fan, powerSupplier);
        fan.setMediator(mediator);
        button.setMediator(mediator);

        System.out.println(fan.isOn());

        mediator.press();

        System.out.println(fan.isOn());

        mediator.press();

        System.out.println(fan.isOn());
    }
}
