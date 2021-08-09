package com.sda.java_advanced_coding.exercises.ex22;


/**
 * Create an abstract 3DShape class that extends the Shape class from the previous task. Add an additional
 * method calculateVolume().
 * Create Cone and Qube classes by extending the 3DShape class, properly implementing abstract methods.
 * Verify the solution correctness
 */
public abstract class Shape3D extends Shape implements Fillable {

    abstract double calculateVolume();

    @Override
    public void fill(double water) {
        if (calculateVolume() > water){
            System.out.println("Not enough water!");
        }else if(calculateVolume() < water){
            System.out.println("Too much water!");
        }else{
            System.out.println("ok");
        }
    }
}
