package com.store.store;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service( "email")
public class EmailNotificationService  implements NotificationService{
    @Override
    public void send(String message) {
        System.out.println( "Sending notification using email...");
        System.out.println("Email sent: " + message);
    }
}
