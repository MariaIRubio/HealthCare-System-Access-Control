package com.exercise.accescontrolhealthcaresystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DoctorController {

    @GetMapping("/doctor/patient-records")
    public String patientRecords(){
        return "doctor/patient-records";
    }

    @GetMapping("/doctor/appointments-scheduler")
    public String appointments(){
        return "doctor/appointments-scheduler";
    }


    @GetMapping("/doctor/make-appointment")
    public String makeAppointments(){
        return "doctor/make-appointment";
    }

    @GetMapping("/doctor/view-appointments")
    public String viewAppointments(){
        return "doctor/view-appointments";
    }

    @GetMapping("/doctor/delete-appointment")
    public String deleteAppointment(){
        return "doctor/delete-appointment";
    }

    @GetMapping("/doctor/update-patient")
    public String updatePatient(){
        return "doctor/update-patient";
    }

}
