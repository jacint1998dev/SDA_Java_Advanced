package com.sda.java_advanced_coding.exercises.ex27;

import com.sda.java_advanced_coding.exercises.ex18.Computer;

/**
 * Design the Joiner<T> class, which in the constructor will take a separator (string) and have a join() method
 * that allows you to specify any number of T-type objects. This method will return a string joining all passed
 * elements by calling their toString() method and separating them with a separator.
 * eg. for Integers and separator "-" it should return: 1-2-3-4 ..
 */
public class Main {
    public static void main(String[] args) {
        Joiner<String> joiner = new Joiner<>("-");
        System.out.println(joiner.join("a", "b", "c"));
        Computer computer = new Computer("I7", "8GB", "Nvidia", "Dell", "G3");
        Computer computer1 = new Computer("I5", "4GB", "Nvidia", "HP", "XYZ");
        Computer computer2 = new Computer("I3", "4GB", "AMD", "Asus", "DSF");
        Joiner<Computer> computerJoiner = new Joiner<>("******");
        System.out.println(computerJoiner.join(computer,computer2,computer1));
    }
}
