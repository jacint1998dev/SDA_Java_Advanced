package com.sda.java_advanced.threads;

public class ThreadGc implements Runnable {

    @Override
    public void run() {
        System.gc();
        System.runFinalization();
        System.out.println("garbage collector has been invoked");
    }
}
