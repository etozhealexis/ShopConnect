package ru.etozhealexis.itprojects.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/registration")
    public String getRegistrationPage() {
        return "registration";
    }

    @GetMapping("/account")
    public String getAccountPage() {
        return "account";
    }

    @GetMapping("/main")
    public String getMainPage() {
        return "main";
    }

    @GetMapping("/items")
    public String getItemsPage() {
        return "items";
    }
}
