package com.example.prkt1UPsev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(Model model) {
        model.getAttribute( "result");
        return "index";
    }

    @PostMapping("/")
    public String index(@RequestParam("a") int a, @RequestParam("b") int b,
                        @RequestParam("deystv") String action, Model model) {
        double result;
        switch(action) {
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / (double)b;
                break;
            case "-":
                result = a - b;
                break;
            case "+":
                result = a + b;
                break;
            default:
                result = 0;
                break;
        }
        model.addAttribute( "result", result);
        return "index";
    }
}
