package com.poly.lab1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/hinhchunhat")
public class HinhChuNhatController {

    @GetMapping("/form")
    public String hienThiForm() {
        return "/hinhchunhat";
    }

    @PostMapping("/tinh")
    public String tinhToan(
            @RequestParam("chieuDai") double chieuDai,
            @RequestParam("chieuRong") double chieuRong,
            @RequestParam("chieuCao") double chieuCao,
            Model model) {

        if(chieuDai < chieuRong) {
            double temp = chieuDai;
            chieuDai = chieuRong;
            chieuRong = temp;
        }

        double dienTich = chieuDai * chieuRong;
        double chuVi = 2 * (chieuDai + chieuRong);
        double theTich = chieuDai * chieuRong * chieuCao;

        model.addAttribute("dienTich", dienTich);
        model.addAttribute("chuVi", chuVi);
        model.addAttribute("theTich", theTich);

        return "/hinhchunhat";
    }
}
