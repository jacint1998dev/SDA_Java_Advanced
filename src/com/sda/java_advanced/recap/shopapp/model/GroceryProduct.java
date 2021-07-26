package com.sda.java_advanced.recap.shopapp.model;
/**
 * - Use exceptions to validate the data passes into constructors when
 * OsProduct,AntivirusProduct,GroceryProduct or PetsFoodProduct is called.
 */

import java.util.Date;

public class GroceryProduct extends FoodProduct {

    private String id;
    private double price;
    private String currency;
    private String name;
    private String description;

    public GroceryProduct(
            Date expirationDate,
            boolean isBio,
            String countryOfOrigin,
            String id,
            Double price,
            String currency,
            String name,
            String description
    ) {

        super(expirationDate, isBio, countryOfOrigin);
        this.id = id;
        //check if price is a valid price
        if (price != null && price > 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Invalid price!");
        }

        this.currency = currency;
        this.name = name;
        this.description = description;
    }

    @Override
    public String getID() {
        return id;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(String id) {
        this.id = id;
    }
}
