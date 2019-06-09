package com.example.tutorial.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class IndexController {

    private String message = "Hello World from IndexController class variable 'message'";

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("greeting", message );
        return "index";
    }
}
