package com.example.rahimsportfolio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {
    @GetMapping("/")

    public String showPortfolio() {
        return "index";
    }

@GetMapping("/more")
    public String showMore() {
        return "more";
    }


    @GetMapping("/profile")
    public String showProfile() {
        return "profile";
    }





}
