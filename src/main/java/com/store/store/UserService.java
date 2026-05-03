package com.store.store;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    private  final NotificationManager notificationManager;

    public UserService(UserRepository userRepository, NotificationManager notificationManager) {
        this.userRepository = userRepository;
        this.notificationManager = notificationManager;
    }

    public void registerUser(User user) {
        if (userRepository.findByEmail(user.getEmail()) != null) {
            throw new IllegalArgumentException("User already exists" + user.getEmail());
        }

        System.out.println("Registering user: " + user);
        userRepository.save(user);
        notificationManager.sendNotification("Registration successful!");
    }
}
