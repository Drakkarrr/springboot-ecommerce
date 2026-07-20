package com.store.store.controller;

import com.store.store.entity.UserEntity;
import com.store.store.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {
    private final UserRepository userRepository;

    @PostMapping("/user")
    public UserEntity createUser(@RequestBody UserEntity userEntity) {
        return userRepository.save(userEntity);
    }
}
