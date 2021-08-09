package com.sda.java_advanced_coding.exercises.ex18;

public class Main {
    public static void main(String[] args) {

        Computer computer = new Computer("I7","8GB","Nvidia","Dell","G3");
        Computer computer1 = new Computer("I5","4GB","Nvidia","HP","XYZ");
        Computer computer2 = new Computer("I3","4GB","AMD","Asus","DSF");
        System.out.println(computer);
        System.out.println(computer1);
        System.out.println(computer2);
        System.out.println(computer.getProcessor());
        System.out.println(computer2.getCompany());
        System.out.println(computer.hashCode());
    }
}
