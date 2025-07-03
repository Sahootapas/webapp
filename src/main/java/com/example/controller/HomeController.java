package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Welcome to My Web Application!");
        return "index";
    }
    
    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "About Us");
        return "about";
    }
    
    @PostMapping("/contact")
    public String contact(@RequestParam String name, 
                         @RequestParam String email, 
                         @RequestParam String message, 
                         Model model) {
        model.addAttribute("success", "Thank you " + name + "! Your message has been received.");
        return "contact";
    }
    
    @GetMapping("/contact")
    public String contactForm() {
        return "contact";
    }
}

