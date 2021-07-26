package com.sda.java_advanced.threads;

public class Main {
    public static void main(String[] args) {
        ThreadA firstThread = new ThreadA("first thread");
        ThreadA secondThread = new ThreadA("second thread");

        firstThread.start();
        secondThread.start();

        Thread firstThreadGc = new Thread(new ThreadGc());
        Thread secondThreadGc = new Thread(new ThreadGc());
        firstThreadGc.start();
        secondThreadGc.start();
    }
}
