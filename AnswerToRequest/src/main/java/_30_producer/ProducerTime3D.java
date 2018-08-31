package _30_producer;

import _10_model.data.DASData;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ProducerTime3D extends ProducerTime {


    private Duration programmingTimeH;
    private LocalDateTime availableStart;
    private LocalDateTime availableFinish;
    private int processingSpeedCM3pH;
    private Duration deliveringTimeH;

    //for calculations
    public ProducerTime3D(int i, DASData<ProducerTime> producersData) {
//        super();
        this.programmingTimeH = producersData.getData().get(i).getDeliveringTimeH();
        this.availableStart = producersData.getData().get(i).getAvailableStart();
        this.availableFinish = producersData.getData().get(i).getAvailableFinish();
        this.processingSpeedCM3pH = producersData.getData().get(i).getProcessingSpeedCM3pH();
        this.deliveringTimeH = producersData.getData().get(i).getDeliveringTimeH();
    }

    //for manual data input
    public ProducerTime3D(String programmingTimeH, String availableStart, String availableFinish, String processingSpeedCM3pH, String deliveringTimeH) {
        this.programmingTimeH = Duration.ofHours(Long.parseLong(programmingTimeH));
        this.availableStart = LocalDateTime.of(LocalDate.parse(availableStart), LocalTime.MIDNIGHT);
        this.availableFinish = LocalDateTime.of(LocalDate.parse(availableFinish), LocalTime.MIDNIGHT);
        this.processingSpeedCM3pH = Integer.valueOf(processingSpeedCM3pH);
        this.deliveringTimeH = Duration.ofHours(Long.parseLong(deliveringTimeH));
    }


    //getset

    public Duration getProgrammingTimeH() {
        return programmingTimeH;
    }

    public LocalDateTime getAvailableStart() {
        return availableStart;
    }

    public LocalDateTime getAvailableFinish() {
        return availableFinish;
    }

    public int getProcessingSpeedCM3pH() {
        return processingSpeedCM3pH;
    }

    public Duration getDeliveringTimeH() {
        return deliveringTimeH;
    }
}
