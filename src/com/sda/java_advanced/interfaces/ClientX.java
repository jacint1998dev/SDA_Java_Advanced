package com.sda.java_advanced.interfaces;

import java.time.Instant;

public class ClientX implements ClientNotifier{
    @Override
    public void notifyClient(Instant currentDateTime) {
        System.out.println("Client X received current date and time: "+currentDateTime);
    }
}
