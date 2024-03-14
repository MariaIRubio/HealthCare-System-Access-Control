package com.exercise.accescontrolhealthcaresystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/unauthorized")
    public String unauthorized(){
        return "unauthorized";
    }
}
