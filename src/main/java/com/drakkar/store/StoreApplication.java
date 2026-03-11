package com.drakkar.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
       var userServices = context.getBean(UserRepository.class);
       userServices.registerUser(new User(1L, "Drak@test", "123456", "Drakkar"));
       userServices.registerUser(new User(2L, "Junrey@test", "123456", "Junrey"));

    }
}
