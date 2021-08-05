package com.sda.java_advanced_coding.exercises.ex17;

public class MeasurementConverter {
    public static double convert(double value, ConversionType conversionType) {
        return conversionType.getConverter().convert(value);
    }
}
