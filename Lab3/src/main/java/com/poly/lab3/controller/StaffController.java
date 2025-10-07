package com.poly.lab3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.poly.lab3.entity.Staff;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Controller
public class StaffController {

    @RequestMapping("/staff")
    public String formStaff(Model model) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2007, Calendar.FEBRUARY, 20);
        Date birthday = calendar.getTime();

        Staff staff = Staff.builder()
                .id("S01")
                .name("Nguyễn Thành An")
                .photo("staff.png")
                .gender(true)
                .birthday(birthday)
                .salary(9876.54321)
                .level(2)
                .build();

        model.addAttribute("staff", staff);
        return "staff";
    }

    @RequestMapping("/staff/list")
    public String list(Model model) {
        List<Staff> list = List.of(
                Staff.builder().id("user1@gmail.com").name("nguyễn văn user1").level(0).build(),
                Staff.builder().id("user2@gmail.com").name("nguyễn văn user2").level(1).build(),
                Staff.builder().id("user3@gmail.com").name("nguyễn văn user3").level(2).build(),
                Staff.builder().id("user4@gmail.com").name("nguyễn văn user4").level(2).build(),
                Staff.builder().id("user5@gmail.com").name("nguyễn văn user5").level(1).build(),
                Staff.builder().id("user6@gmail.com").name("nguyễn văn user6").level(0).build()
        );
        model.addAttribute("list", list);
        return "staff-list";
    }

    @RequestMapping("/staff/list-status")
    public String listStatus(Model model) {
        List<Staff> list = List.of(
                Staff.builder().id("user1@gmail.com").name("nguyễn văn user1").level(0).build(),
                Staff.builder().id("user2@gmail.com").name("nguyễn văn user2").level(1).build(),
                Staff.builder().id("user3@gmail.com").name("nguyễn văn user3").level(2).build(),
                Staff.builder().id("user4@gmail.com").name("nguyễn văn user4").level(2).build(),
                Staff.builder().id("user5@gmail.com").name("nguyễn văn user5").level(1).build(),
                Staff.builder().id("user6@gmail.com").name("nguyễn văn user6").level(0).build()
        );
        model.addAttribute("listST", list);
        return "list-status";
    }

    @RequestMapping("/staff/list-controls")
    public String listControls(Model model) {
        List<Staff> list = List.of(
                Staff.builder().id("user1@gmail.com").name("nguyễn văn user1").level(0).build(),
                Staff.builder().id("user2@gmail.com").name("nguyễn văn user2").level(1).build(),
                Staff.builder().id("user3@gmail.com").name("nguyễn văn user3").level(2).build(),
                Staff.builder().id("user4@gmail.com").name("nguyễn văn user4").level(2).build(),
                Staff.builder().id("user5@gmail.com").name("nguyễn văn user5").level(1).build(),
                Staff.builder().id("user6@gmail.com").name("nguyễn văn user6").level(0).build()
        );
        model.addAttribute("listCT", list);
        return "list-controls";
    }
}
