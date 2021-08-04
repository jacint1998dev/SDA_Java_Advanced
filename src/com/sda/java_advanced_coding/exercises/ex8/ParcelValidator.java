package com.sda.java_advanced_coding.exercises.ex8;

public class ParcelValidator implements Validator<Parcel> {

    /**
     * The validator should verify that the sum of the dimensions (x, y, z) does not exceed 300, whether each size is
     * not less than 30, whether the weight does not exceed 30.0 for isExpress = false or 15.0 for isExpress = true. In
     * case of errors, it should inform the user about them
     */
    @Override
    public boolean validate(Parcel parcel) {
        int dimensionsSum = parcel.getxLength() + parcel.getyLength() + parcel.getzLength();
        if (dimensionsSum > 300) {
            System.out.println("The parcel is too big");
            return false;
        }
        if (parcel.getxLength() < 30 || parcel.getyLength() < 30 || parcel.getzLength() < 30) {
            System.out.println("The dimension is not valid");
            return false;
        }
        if (parcel.isExpress() && parcel.getWeight() > 15.0) {
            System.out.println("The weight is too big for express parcel");
            return false;
        }
        if (!parcel.isExpress() && parcel.getWeight() > 30.0) {
            System.out.println("The weight is too big for regular parcel");
            return false;
        }

        System.out.println("Valid");
        return true;
    }
}
