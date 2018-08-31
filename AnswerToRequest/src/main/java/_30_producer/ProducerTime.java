package _30_producer;

import _10_model.data.DASData;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ProducerTime {

    private Duration programmingTimeH;
    private LocalDateTime availableStart;
    private LocalDateTime availableFinish;

    private Duration deliveringTimeH;

    //for calculations
    public ProducerTime(int i, DASData<Producer> producersData) {
//        super();
        this.availableStart = producersData.getData().get(i).getProducerTime().getAvailableStart();
        this.availableFinish = producersData.getData().get(i).getProducerTime().getAvailableFinish();
        this.deliveringTimeH = producersData.getData().get(i).getProducerTime().getDeliveringTimeH();
    }

    //for manual data input
    public ProducerTime(String programmingTimeH, String availableStart, String availableFinish, String deliveringTimeH) {
        this.programmingTimeH = Duration.ofHours(Long.parseLong(programmingTimeH));
        this.availableStart = LocalDateTime.of(LocalDate.parse(availableStart), LocalTime.MIDNIGHT);
        this.availableFinish = LocalDateTime.of(LocalDate.parse(availableFinish), LocalTime.MIDNIGHT);
        this.deliveringTimeH = Duration.ofHours(Long.parseLong(deliveringTimeH));
    }


    public Duration getProgrammingTimeH() {
        return programmingTimeH;
    }

    public void setProgrammingTimeH(Duration programmingTimeH) {
        this.programmingTimeH = programmingTimeH;
    }

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

    public Duration getDeliveringTimeH() {
        return deliveringTimeH;
    }

    public void setDeliveringTimeH(Duration deliveringTimeH) {
        this.deliveringTimeH = deliveringTimeH;
    }
}

// TODO: 18.8.18 Stage2
//    // id
//    private static int producerId; ??

//    //scope
//    private String maxDimensionsMM;

//    //price
//    private double materialCost; //
//    private double programmingRate; //
//    private double machineUsageRate; //
//    private double handlingCost; //
//    private double deliveringCost;  //
