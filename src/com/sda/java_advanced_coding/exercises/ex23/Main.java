package com.sda.java_advanced_coding.exercises.ex23;

/**
 * Create a Zoo class that will have a collection of animals and will allow you to receive statistics about your
 * animals:
 * int getNumberOfAllAnimals() → returns the number of all animals
 * Map <String, Integer> getAnimalsCount() → returns the number of animals of each species
 * Map <String, Integer> getAnimalsCountSorted() → returns the number of animals of each species
 * sorted based on the number of animals of a given species, where the first element is always the species with
 * the largest number of animals
 * void addAnimals(String, int) → adds n animals of a given species
 */
public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        System.out.println(zoo.getNumberOfAllAnimals());
        zoo.addAnimals("bear",2);
        System.out.println(zoo.getAnimalsCount());
        System.out.println(zoo.getNumberOfAllAnimals());


        zoo.addAnimals("zebra",3);
        System.out.println(zoo.getAnimalsCount());
        System.out.println(zoo.getNumberOfAllAnimals());

        zoo.addAnimals("bear",3);
        System.out.println(zoo.getAnimalsCount());
        System.out.println(zoo.getNumberOfAllAnimals());

        zoo.addAnimals("giraffe",7);
        System.out.println(zoo.getAnimalsCount());
        System.out.println(zoo.getNumberOfAllAnimals());

        zoo.addAnimals("monkey",4);
        System.out.println(zoo.getAnimalsCount());
        System.out.println(zoo.getNumberOfAllAnimals());

        System.out.println(zoo.getAnimalsCountSorted());




    }
}
