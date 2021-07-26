package com.sda.java_advanced.recap.shopapp.model;

/**
 * - create the interface Sellable with the fallowing methods:
 * - getPrice()
 * - getCurrency()
 * - getName()
 * - getDescription()
 * - getProductCategory()
 * - getId()
 */
public interface Sellable {

    String getID();

    double getPrice();

    String getCurrency();

    String getName();

    String getDescription();

    String getProductCategory();


}
