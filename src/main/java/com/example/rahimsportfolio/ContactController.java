package com.example.rahimsportfolio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

    @PostMapping("/contact")
    public String handleContactForm(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String message,
            Model model) {

        try {
            System.out.println("📩 New message from " + name + " (" + email + "): " + message);

            // TODO: send email or save message to DB later
            model.addAttribute("success", true);
        } catch (Exception e) {
            model.addAttribute("error", true);
        }

        return "index"; // reload same page with feedback
    }
}
