package com.poly.lab4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class LayoutController {

    @RequestMapping("/index")
    public String index(Model model) {
        return "/home";
    }

    @RequestMapping("/about")
    public String about(Model model) {
        return "/about";
    }

    @RequestMapping("/create")
    public String create(Model model) {
        return "/staff-create";
    }

}
