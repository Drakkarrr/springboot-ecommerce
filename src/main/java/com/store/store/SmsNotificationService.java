package com.store.store;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class SmsNotificationService implements NotificationService{
    @Override
    public void send(String message, String recipientEmail) {
        System.out.println("Sending notification using SMS...");
        System.out.println("SMS sent: " + message);
    }
}
