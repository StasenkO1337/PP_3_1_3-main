package ru.kata.spring.boot_security.demo.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.kata.spring.boot_security.demo.models.User;

@Controller
public class AuthController {

    @GetMapping()
    public String getSinglePage(Authentication authentication, Model model) {
        User authUser = (User) authentication.getPrincipal();
        model.addAttribute("authUser", authUser);
        return "admin";
    }
}