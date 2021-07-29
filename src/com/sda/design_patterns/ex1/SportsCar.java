package com.sda.design_patterns.ex1;

public class SportsCar extends CarDecorator{

    public SportsCar(Car car) {
        super(car);
    }
    @Override
    public void assemble(){
        super.assemble();
        System.out.println("Adding features for sports car");
    }
}
