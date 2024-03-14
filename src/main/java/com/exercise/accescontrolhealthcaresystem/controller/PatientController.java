package com.exercise.accescontrolhealthcaresystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PatientController {

    @GetMapping("/patient/appointments-scheduler")
    public String manageAppointments(){
        return "patient/appointments-scheduler";
    }
    @GetMapping("/patient/view-appointments")
    public String displayAppointments(){
        return "patient/view-appointments";
    }

    @GetMapping("/patient/make-appointment")
    public String makeAppointments(){
        return "patient/make-appointment";
    }

    @GetMapping("/patient/update-appointment")
    public String updateAppointments(){
        return "patient/update-appointment";
    }

    @GetMapping("/patient/delete-appointment")
    public String deleteAppointments(){
        return "patient/delete-appointment";
    }


}
