package com.drakkar.store;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutController {
    @RequestMapping("/about")
    public String index(Model model) {
        model.addAttribute("age", "26");
        return "About.html";
    }
}
