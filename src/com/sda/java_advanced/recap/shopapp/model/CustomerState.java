package com.sda.java_advanced.recap.shopapp.model;

/**3. Enums**
 - create the enum CustomerState with some values (New, Active, Closed, Banned).
 Override the toString method to print the pretty name.
 - create a method that should return if the state permits shopping  */
public enum CustomerState {

    NEW("New", false),
    ACTIVE("Active", true),
    CLOSED("Closed", false),
    BANNED("Banned", false);

    String prettyName;
    boolean isShoppingActive;

    CustomerState(String prettyName, boolean isShoppingActive) {
        this.prettyName = prettyName;
        this.isShoppingActive = isShoppingActive;
    }

    public boolean isShoppingActive() {
        return isShoppingActive;
    }


    @Override
    public String toString() {
        return prettyName;
    }
}
