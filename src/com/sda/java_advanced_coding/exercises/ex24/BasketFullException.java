package com.sda.java_advanced_coding.exercises.ex24;

public class BasketFullException extends RuntimeException {
    public BasketFullException() {
        super("Basket is full!");
    }
}
