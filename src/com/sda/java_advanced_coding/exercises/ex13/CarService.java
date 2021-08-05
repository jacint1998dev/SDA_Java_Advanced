package com.sda.java_advanced_coding.exercises.ex13;

import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public interface CarService {

    void addCars(Set<Car> cars);

    void removeCar(Car car);

    List<Car> getCars();

    List<Car> getCarsWithV12Engine();

    List<Car> getCarsBefore1999();

    Car getMostExpensiveCar();

    Car getCheapestCar();

    List<Car> getCarsWithAtLeastThreeManufacturers();

    List<Car> getCarsSortedByPrice(boolean ascending);

    boolean isCarInList(Car car);

    List<Car> getCarByManufacturer(Manufacturer manufacturer);

    List<Car> getCarsByYearOfEstablishment(Predicate<Integer> yearOfEstablishmentFilterCondition);
}
