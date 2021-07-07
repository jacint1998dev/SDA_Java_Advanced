package com.sda.interfaces;

import java.time.Instant;

public interface ClientNotifier {
    void notifyClient(Instant currentDateTime);

}
