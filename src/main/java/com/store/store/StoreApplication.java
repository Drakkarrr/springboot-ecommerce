package com.store.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        var userService =context.getBean(UserService.class);
        userService.registerUser(new User(1L, "drak@test", "pass123", "Drakkar"));

//        var resource = context.getBean(HeavyResource.class);
        var orderService = context.getBean(OrderService.class);
        orderService.placeOrder();

//        var notificationManager = context.getBean(NotificationManager.class);
//        notificationManager.sendNotification("Hello, this is a notification!");
    }

}
