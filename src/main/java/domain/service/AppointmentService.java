package domain.service;

import domain.model.Appointment;
import java.util.ArrayList;

public class AppointmentService {

    private static AppointmentService INSTANCE;
    private ArrayList<Appointment> appointments = new ArrayList<>();

    public AppointmentService() {
    }

    public static AppointmentService getInstance() {
        if(INSTANCE == null) INSTANCE = new AppointmentService();
        return INSTANCE;
    }

    public ArrayList<Appointment> getAllAppointment() {
        return this.appointments;
    }

    public void addAppointment(Appointment appointment) {
        this.appointments.add(appointment);
    }

    public void deleteAppointment(String id) {
        ArrayList<Appointment> newAppointments = new ArrayList<>();
        for (Appointment appointment : this.appointments) {
            if (!appointment.getId().equals(id)) newAppointments.add(appointment);
        }
        this.appointments = newAppointments;
    }

    public void deleteAllAppointment () {
        appointments = new ArrayList<>();
    }

    public Appointment getAppointmentWithId(String id) {
        for (Appointment appointment : this.appointments) {
            if (appointment.getId().equals(id)) return appointment;
        }
        return null;
    }
}