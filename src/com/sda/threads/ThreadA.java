package com.sda.threads;

public class ThreadA extends Thread {
    private String customMessage;

    public ThreadA(String customMessage) {
        this.customMessage = customMessage;
    }

    @Override
    public void run() {

        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Hi I am threadA");
                Thread.sleep(300);
                System.out.println(customMessage);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
