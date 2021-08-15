package controller;

import domain.service.AppointmentService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Overview extends RequestHandler {
    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("appointments", AppointmentService.getInstance().getAllAppointment());
        return "appointments.jsp";
    }
}