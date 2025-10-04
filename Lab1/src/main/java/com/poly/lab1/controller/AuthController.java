package com.poly.lab1.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/login")
public class AuthController {

    @Autowired
    HttpServletRequest request;

    @GetMapping("/form")
    public String form() {
        return "/form";
    }

    @PostMapping("/check")
    public String login(Model model) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123".equals(password)) {
            model.addAttribute("message", "Đăng Nhập Thành Công !");
            model.addAttribute("subject", "Nguyen Thanh An");
            return "/trangchu";
        } else {
            model.addAttribute("message", "Đăng Nhập Thất Bại ! Sai tài khoản hoặc mật khẩu !");
        }

        return "/form";
    }
}
