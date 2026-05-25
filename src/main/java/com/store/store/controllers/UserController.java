package com.store.store.controllers;

import com.store.store.dtos.UserDto;
import com.store.store.entities.User;
import com.store.store.mappers.UserMapper;
import com.store.store.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @GetMapping
    public Iterable<UserDto> getAllUsers(
            @RequestParam(required = false, defaultValue = "", name = "sortedby") String sortedby) {

        if (!Set.of("name", "email").contains(sortedby))
            sortedby = "name";

        return userRepository.findAll(Sort.by(sortedby))
                             .stream()
                             .map(userMapper::toDto)
                             .toList();

    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUser(@PathVariable Long id) {
        var user = userRepository.findById(id).orElse(null);
        if (user == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(userMapper.toDto(user));
    }
}
