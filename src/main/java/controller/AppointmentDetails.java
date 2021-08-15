package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AppointmentDetails extends RequestHandler{
    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        request.setAttribute("appointment", service.getAppointmentWithId(id));
        System.out.println("id: " + service.getAppointmentWithId(id).getId() + " Timeslot: " + service.getAppointmentWithId(id).getTimeSlot() + " Location: " + service.getAppointmentWithId(id).getLocation());
        return "appointment.jsp";
    }
}