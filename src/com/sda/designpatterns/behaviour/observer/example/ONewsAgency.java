package com.sda.denisbalaceanu.designpatterns.behaviour.observer.example;

import java.util.Observable;

public class ONewsAgency extends Observable
{
    private String news;

    public void setNews(String news)
    {
        this.news = news;
        setChanged();
        notifyObservers(news);
    }
}
