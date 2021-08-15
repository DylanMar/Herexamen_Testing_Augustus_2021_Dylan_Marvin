package domain.model;

import java.time.LocalDateTime;

public class TimeSlot {

    private LocalDateTime begin, end;

    public TimeSlot(LocalDateTime begin, LocalDateTime end) {
        setBegin(begin);
        setEnd(end);
    }

    public LocalDateTime getBegin() {
        return this.begin;
    }

    public void setBegin(LocalDateTime begin) {
        this.begin = begin;
    }

    public LocalDateTime getEnd() {
        return this.end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }
}