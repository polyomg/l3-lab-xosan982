package com.poly.lab1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/poly/hello")
    public String hello(Model model) {
        model.addAttribute("title", "FPT Polytechnic");
        model.addAttribute("subject", "Nguyễn Thành An TS00724");
        return "/hello";
    }
}
