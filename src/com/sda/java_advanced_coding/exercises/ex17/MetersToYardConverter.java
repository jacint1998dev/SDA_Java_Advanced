package com.sda.java_advanced_coding.exercises.ex17;

public class MetersToYardConverter implements Converter {

    @Override
    public double convert(double measurement) {
        return measurement * 1.093;
    }
}
