package _50_request;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class RequestTime {

    private LocalDateTime deadline;

    public RequestTime(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }



}
