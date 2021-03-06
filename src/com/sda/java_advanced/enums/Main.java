package com.sda.java_advanced.enums;

/*Create enum Planets.
 - Override toString method. It should print relative size of a planet and it's name.
E.g. „Huge Jupiter", „Small Pluto".
 - Create distanceFromEarth method.
 - Verify both methods for multiple planets.
* */
public class Main {
    public static void main(String[] args) {

        for (Planet planet: Planet.values()){
            System.out.println(planet);
            System.out.println(planet.name());
            System.out.println(planet.getDistanceFromEarth());
        }
        Planet planetX = Planet.valueOf("VENUS");
        switch (planetX){
            case EARTH:
                System.out.println("This is Earth");
                break;
            case PLUTO:
            case VENUS:
            case URANUS:
            case JUPITER:
            case MERCURY:
            case NEPTUNE:
                System.out.println("This is another planet. Go back home and try to live.");
                break;
            default:
                System.out.println("This is not handled");

        }
    }

}
