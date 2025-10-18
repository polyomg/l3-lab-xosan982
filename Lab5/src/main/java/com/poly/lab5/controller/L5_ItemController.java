package com.poly.lab5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.poly.lab5.ultis.DB;

@Controller
public class L5_ItemController {
    @RequestMapping("/item/index")
    public String list(Model model){
        model.addAttribute("items", DB.items.values());
        return "item/index";
    }
}
