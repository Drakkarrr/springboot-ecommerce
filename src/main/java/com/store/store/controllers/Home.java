package com.store.store.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "Drakkar");
        return "Home";
    }
}
