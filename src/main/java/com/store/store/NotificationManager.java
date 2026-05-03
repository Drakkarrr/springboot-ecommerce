package com.store.store;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NotificationManager {
    private final NotificationService notificationService;
    private final String recipientEmail = "";

    public NotificationManager(@Qualifier("email") NotificationService notificationService) {
        this.notificationService = notificationService;
        System.out.println("NotificationManager created");

    }

    public void sendNotification(String message) {
        notificationService.send(message, recipientEmail);
    }
}
