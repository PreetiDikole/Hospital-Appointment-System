package controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Appointment;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

    @PostMapping
    public Appointment bookAppointment(@RequestBody Appointment appointment) {
        
        System.out.println("Appointment booked: " + appointment.getPatientName() + " - " + appointment.getAppointmentDate());
        return appointment;
    }
}
