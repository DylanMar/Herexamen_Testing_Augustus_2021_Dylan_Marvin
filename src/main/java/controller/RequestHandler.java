package controller;

import domain.service.AppointmentService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class RequestHandler {

    protected AppointmentService service = AppointmentService.getInstance();

    public abstract String handleRequest (HttpServletRequest request, HttpServletResponse response);

    public void setModel (AppointmentService contactTracingService) {
        this.service = contactTracingService;
    }

    public AppointmentService getService() {
        return service;
    }

}
