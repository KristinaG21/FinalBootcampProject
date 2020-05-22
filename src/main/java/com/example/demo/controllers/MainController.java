package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("title", "Main Page");
        return "home";
    }

    @GetMapping("/citytourism")
    public String cityTourismPage(Model model){
        model.addAttribute("title", "City Tourism");
        return "citytourism";
    }
    @GetMapping("/countrytourism")
    public String countryTourismPage(Model model){
        model.addAttribute("title", "Country Tourism");
        return "countrytourism";
    }
}
