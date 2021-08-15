package domain.model;

public class Appointment {

    private String id, location;
    private TimeSlot timeSlot;

    public Appointment(String id, String location, TimeSlot timeSlot) {
        setId(id);
        setLocation(location);
        setTimeSlot(timeSlot);
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public TimeSlot getTimeSlot() {
        return this.timeSlot;
    }

    public void setTimeSlot(TimeSlot timeSlot) {
        this.timeSlot = timeSlot;
    }
}