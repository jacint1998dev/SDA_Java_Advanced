package com.sda.java_advanced_coding.exercises.ex21;

/**
 * Create an abstract 3DShape class that extends the Shape class from the previous task. Add an additional
 * method calculateVolume().
 * Create Cone and Qube classes by extending the 3DShape class, properly implementing abstract methods.
 * Verify the solution correctness
 */
public abstract class Shape3D extends Shape{

    abstract double calculateVolume();

}
