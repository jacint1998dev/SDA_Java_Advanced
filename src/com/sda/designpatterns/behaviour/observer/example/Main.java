package com.sda.denisbalaceanu.designpatterns.behaviour.observer.example;

public class Main
{
    public static void main(String[] args)
    {
        ONewsAgency observable = new ONewsAgency();
        ONewsChannel observer = new ONewsChannel();
        observable.addObserver(observer);


        observable.setNews("news ghjkjjghkk");
        System.out.println(observer.getNews());

        observable.setNews("news dffdsdsf");
        System.out.println(observer.getNews());

        observable.setNews("news saddsa");
        System.out.println(observer.getNews());

        observable.setNews("news ASASDSA");
        System.out.println(observer.getNews());
    }
}
