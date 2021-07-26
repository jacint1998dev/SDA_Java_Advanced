package com.sda.java_advanced.billapp;

public interface PayableType {
    int getValue();

    CurrencyType getCurrency();

    boolean isFake();

}
