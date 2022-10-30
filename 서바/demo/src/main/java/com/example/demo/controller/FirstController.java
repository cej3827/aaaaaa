package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hi") //url 요청 연결
    public String niceToMeetYou(Model model) {
        model.addAttribute("username","eun jin");
        return "greetings";
    }
}
