package com.exercise.accescontrolhealthcaresystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/admin/staff-management")
    public String medicalStaff(){
        return "admin/staff-management";
    }

    @GetMapping("/admin/add")
    public String addStaff(){
        return "admin/add";
    }

    @GetMapping("/admin/update")
    public String updateStaff(){
        return "admin/update";
    }

    @GetMapping("/admin/find")
    public String findStaff(){
        return "admin/find";
    }

    @GetMapping("/admin/delete")
    public String deleteStaff(){
        return "admin/delete";
    }

    @GetMapping("/admin/display")
    public String displayStaff(){
        return "admin/display";
    }
}
