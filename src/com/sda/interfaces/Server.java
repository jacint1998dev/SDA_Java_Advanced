package com.sda.interfaces;

import java.lang.reflect.Array;
import java.time.Instant;
import java.util.List;

public class Server {
    private ClientNotifier[] clients;

    public Server(ClientNotifier[] clients){
        this.clients = clients;
    }
    public void notifyAllClients(){
        for (ClientNotifier client : clients){
            client.notifyClient(Instant.now());
        }
    }

}
