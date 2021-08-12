package com.sda.java_advanced_coding.exercises.ex34;

/**
 * Create a class that extends the Thread class, e.g. MyThread, overload the run() method so it displays the
 * thread name in the console by reading it from the static method of the current thread:
 * Thread.currentThread().getName()
 * Create a class with the public static void main (String [] args) method. Inside the main method create a
 * type variable of our class created above, e.g. MyThread and initialize the class. Perform the start() method
 * on the variable.
 */
public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();
        MyThread myThread4 = new MyThread();
        MyThread myThread5 = new MyThread();
        MyThread myThread6 = new MyThread();
        MyThread myThread7 = new MyThread();

        myThread.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
        myThread5.start();
        myThread6.start();
        myThread7.start();
    }
}
