package com.sda.java_advanced_coding.exercises.ex25;

import java.util.zip.CheckedInputStream;

public class BasketEmptyException extends Exception {
    public BasketEmptyException() {
        super("Basket is empty!");
    }
}
