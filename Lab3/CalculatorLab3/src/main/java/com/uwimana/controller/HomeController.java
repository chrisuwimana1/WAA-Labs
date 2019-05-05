package com.uwimana.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping
    public String welcome(Model model) {
        model.addAttribute("greeting", "Welcome to My calculator!");
        model.addAttribute("tagline", "This is the calculator for Lab 3");
        return "welcome";
    }
}
