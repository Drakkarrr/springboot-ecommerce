package com.store.store.controllers;

import com.store.store.entities.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @RequestMapping("/message")
    public Message getMessage() {
        return new Message("Hello World!");
    }
}
