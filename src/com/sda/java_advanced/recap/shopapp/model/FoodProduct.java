package com.sda.java_advanced.recap.shopapp.model;

import java.time.Instant;
import java.util.Date;

/**
 * - create the abstract class FoodProduct  that implements Sellable and encapsulates the fallowing data:
 * - expirationDate: date
 * - isBio: boolean
 * - countryOfOrigin: String
 * - create a constructor that will accept all the fields as parameters
 * - add getters for all the fields
 */
public abstract class FoodProduct implements Sellable {
    private static final String FOOD_CATEGORY = "FOOD";
    private Date expirationDate;
    private boolean isBio;
    private String countryOfOrigin;

    public FoodProduct(Date expirationDate, boolean isBio, String countryOfOrigin) {

        //check if product is expired
        if (expirationDate.before(Date.from(Instant.now()))){
            throw new IllegalArgumentException("Product is expired! " + expirationDate);
        }
        this.expirationDate = expirationDate;
        this.isBio = isBio;
        this.countryOfOrigin = countryOfOrigin;
    }

    @Override
    public String getProductCategory() {
        return FOOD_CATEGORY;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean isBio() {
        return isBio;
    }

    public void setBio(boolean bio) {
        isBio = bio;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }


}
