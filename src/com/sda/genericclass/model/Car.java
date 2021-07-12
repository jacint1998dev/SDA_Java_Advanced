package com.sda.genericclass.model;

public class Car implements Identifiable {

    private String VIN;
    private String colour;



    @Override
    public String getID() {
        return VIN;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
