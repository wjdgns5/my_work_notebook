package com.example.demo._domain.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class SampleController {
    // http://localhost:8080/
    @GetMapping("/")
    public String home(Model model, HttpServletRequest request) {

        String[] keyword ={"구름", "과자", "하늘", "사과"};

        model.addAttribute("keyword", keyword);
        request.setAttribute("age", 17);
        model.addAttribute("name", "홍길동");

        return "hello";
    }
}
