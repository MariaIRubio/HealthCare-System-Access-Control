package com.exercise.accescontrolhealthcaresystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/patient")
    public String patient(){
        return "patient";
    }

    @GetMapping("/doctor")
    public String doctor(){
        return "doctor";
    }

    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }
}
