package _60_proposal;

import java.time.LocalDateTime;

public class ProposalTimeTime3D extends ProposalTime {

    //time
    private LocalDateTime availableStart; // TODO: Stage1.1 - to list of dates availableTime;
    private LocalDateTime availableFinish;
    private LocalDateTime earlyFinish;

    // empty ProposalTime
    public ProposalTimeTime3D() {
    }

    //for manual input
    public ProposalTimeTime3D(LocalDateTime availableStart, LocalDateTime availableFinish, LocalDateTime earlyFinish) {
        this.availableStart = availableStart;
        this.availableFinish = availableFinish;
        this.earlyFinish = earlyFinish;
    }

    //getset
    public LocalDateTime getAvailableStart() {
        return availableStart;
    }

    public void setAvailableStart(LocalDateTime availableStart) {
        this.availableStart = availableStart;
    }

    public LocalDateTime getAvailableFinish() {
        return availableFinish;
    }

    public void setAvailableFinish(LocalDateTime availableFinish) {
        this.availableFinish = availableFinish;
    }

    public LocalDateTime getEarlyFinish() {
        return earlyFinish;
    }

    public void setEarlyFinishDate(LocalDateTime earlyFinish) {
        this.earlyFinish = earlyFinish;
    }
}
