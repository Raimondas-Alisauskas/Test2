package _50_request;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class RequestTime3D {
    //scope
    private long maxDimensionsMM; // TODO: Stage2 Validumo Tikrinimas.
    private long volumeCM3; // TODO: Stage2 Validumo Tikrinimas.
    //time
    private LocalDateTime deadline;

    public RequestTime3D() {
    }

    //for manual input
    public RequestTime3D(String maxDimensionsMM, String volumeCM3, String deadline) {
        this.maxDimensionsMM = Long.valueOf(maxDimensionsMM);
        this.volumeCM3 = Long.valueOf(volumeCM3);
        this.deadline = LocalDateTime.of(LocalDate.parse(deadline), LocalTime.MIDNIGHT);
    }


    //getset

    public long getMaxDimensionsMM() {
        return maxDimensionsMM;
    }

    public void setMaxDimensionsMM(long maxDimensionsMM) {
        this.maxDimensionsMM = maxDimensionsMM;
    }

    public long getVolumeCM3() {
        return volumeCM3;
    }

    public void setVolumeCM3(long volumeCM3) {
        this.volumeCM3 = volumeCM3;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }



}
