package com.sda.java_advanced_coding.exercises.ex8;

/**
 * Implement the Validator interface, which will include a boolean validate(Parcel input) method in its
 * declaration. Create a Parcel class with the parameters:
 * • int xLength
 * • int yLength
 * • int zLength
 * • float weight
 * • boolean isExpress
 * The validator should verify that the sum of the dimensions (x, y, z) does not exceed 300, whether each size is
 * not less than 30, whether the weight does not exceed 30.0 for isExpress = false or 15.0 for isExpress = true. In
 * case of errors, it should inform the user about them.
 */
public class Main {
    public static void main(String[] args) {
        Parcel parcel1 = new Parcel(35,31,40,10,true);
        Parcel parcel2 = new Parcel(130,131,100,25,false);
        Parcel parcel3 = new Parcel(10,30,30,25,false);
        Parcel parcel4 = new Parcel(30,30,30,35,false);
        Parcel parcel5 = new Parcel(30,30,30,16,true);
        Validator<Parcel> parcelValidator = new ParcelValidator();
        parcelValidator.validate(parcel1);
        parcelValidator.validate(parcel2);
        parcelValidator.validate(parcel3);
        parcelValidator.validate(parcel4);
        parcelValidator.validate(parcel5);
    }
}
