package com.sda.java_advanced_coding.exercises.ex17;

/**
 * Create a ConversionType enum class with the constants METERS_TO_YARDS, YARDS_TO_METERS,
 * CENTIMETERS_TO_ICHES, INCHES_TO_CENTIMETERS, KILOMETERS_TO_MILES, MILES_TO_KILOMETERS.
 * Enum should have a Convertertype parameter used to perform calculations for a given type.
 * Then create a MeasurementConverter class that will have the convert(int value, ConvertionType
 * conversionType) method and based on the value and type of conversion, used the Converter of the given
 * type and returned the result
 */
public enum ConversionType {
    METERS_TO_YARDS(new MetersToYardConverter()),
    YARDS_TO_METERS(yard -> yard * 0.914),
    CENTIMETERS_TO_INCHES(centimeter -> centimeter * 2.5),
    INCHES_TO_CENTIMETERS(inch -> inch * 0.3),
    KILOMETERS_TO_MILES(kilometer -> kilometer * 1.6),
    MILES_TO_KILOMETERS(mile -> mile * 0.7);

    private Converter converter;

    ConversionType(Converter converter) {
        this.converter = converter;
    }

    public Converter getConverter() {
        return converter;
    }
}
