package com.sda.java_advanced_coding.exercises.ex24;

public class BasketEmptyException extends RuntimeException {
    public BasketEmptyException() {
        super("Basket is empty!");
    }
}
