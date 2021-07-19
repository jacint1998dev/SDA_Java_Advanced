package com.sda.conccurancy.exercise2.client;

import com.sda.conccurancy.exercise2.Main;

import java.util.Random;

public class ClientDeleter extends Thread{

    private static final Random RANDOM = new Random();

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(50);
                int indexToBeDeleted = RANDOM.nextInt(Main.PERSON_REPOSITORY.getSize()+1);
                Main.PERSON_REPOSITORY.deletePersonById(indexToBeDeleted);
                System.out.println("Person deleted"+ indexToBeDeleted);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
