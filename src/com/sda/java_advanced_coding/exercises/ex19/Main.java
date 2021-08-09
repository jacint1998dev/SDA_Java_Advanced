package com.sda.java_advanced_coding.exercises.ex19;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Computer,Integer> stock = new HashMap<>();

        Computer computer = new Computer("I7","8GB","Nvidia","Dell","G3");
        Computer computer1 = new Computer("I5","4GB","Nvidia","HP","XYZ");
        Computer computer2 = new Computer("I3","4GB","AMD","Asus","DSF");

        Computer laptop = new Laptop("3400","64","1800","AMD","KAS","15000mA");

        System.out.println(laptop);
        System.out.println(laptop.hashCode());

        stock.put(computer,10);
        stock.put(computer1,5);

        System.out.println(stock);
    }
}
