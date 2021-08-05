package com.sda.java_advanced_coding.exercises.ex13;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Create a CarService class that will contain a list of cars and implement the following methods:
 * 1. adding cars to the list,
 * 2. removing a car from the list,
 * 3. returning a list of all cars,
 * 4. returning cars with a V12 engine,
 * 5. returning cars produced before 1999,
 * 6. returning the most expensive car,
 * 7. returning the cheapest car,
 * 8. returning the car with at least 3 manufacturers,
 * 9. returning a list of all cars sorted according to the passed parameter: ascending / descending,
 * 10. checking if a specific car is on the list,
 * 11. returning a list of cars manufactured by a specific manufacturer,
 * 12. returning the list of cars manufactured by the manufacturer with the year of establishment <,>, <=,> =,
 * =,! = from the given
 */
public class Main {
    public static void main(String[] args) {
        CarService carService = new CarServiceImpl();

        Manufacturer volvo = new Manufacturer("VOLVO",1980,"Sweden");
        Manufacturer vw = new Manufacturer("Volkswagen",1985,"Germany");
        Manufacturer audi = new Manufacturer("Audi",1995,"Germany");
        Manufacturer dacia = new Manufacturer("DACIA",1970,"Romania");

        Car carVW = new Car(
                "Volkswagen",
                "Hatchback",
                25000,
                2003,
                new HashSet<>(Arrays.asList(vw)),
                EngineType.S3
        );
        Car carVolvo = new Car(
                "Volvo",
                "Sedan",
                25000,
                1985,
                new HashSet<>(Arrays.asList(volvo)),
                EngineType.V12
        );
        Car carAudi = new Car(
                "Audi",
                "Sedan",
                35000,
                2011,
                new HashSet<>(Arrays.asList(audi)),
                EngineType.V8
        );
        Car carDacia = new Car(
                "Dacia",
                "Sedan",
                8000,
                2005,
                new HashSet<>(Arrays.asList(dacia)),
                EngineType.S4
        );

        carService.addCars(new HashSet<>(Arrays.asList(carVolvo,carVW,carAudi,carDacia)));
        carService.getCars().forEach(System.out::println);
        System.out.println("-----------------------------");
        carService.getCarsWithV12Engine().forEach(System.out::println);
        System.out.println("-----------------------------");
        carService.getCarsBefore1999().forEach(System.out::println);
        System.out.println("-----------------------------");
        System.out.println(carService.getMostExpensiveCar());
        System.out.println("-----------------------------");
        System.out.println(carService.getCheapestCar());
        System.out.println("-----------------------------");
        carService.getCarsWithAtLeastThreeManufacturers().forEach(System.out::println);
        System.out.println("-----------------------------");
        carService.getCarsSortedByPrice(true).forEach(System.out::println);
        System.out.println("-----------------------------");
        System.out.println(carService.isCarInList(carDacia));
        System.out.println("-----------------------------");
        carService.getCarByManufacturer(audi).forEach(System.out::println);
        System.out.println("-----------------------------");
        carService.getCarsByYearOfEstablishment(yearOfEstablishment -> yearOfEstablishment > 2005);
    }
}
