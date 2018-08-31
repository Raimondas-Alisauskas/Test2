package _80_utils;

import _30_producer.Producer;
import _30_producer.ProducerTime;
import _30_producer.ProducerTime3D;
import _50_request.Request;

import java.time.Duration;

public class ProductionDurationCalculator {

    public Duration calcProductionDuration(Request request, ProducerTime producerTime) {

        long processingSpeedUnitpH = producerTime.getProcessingSpeedCM3pH();
        long volumeUnit = request.getVolumeCM3();
        Duration preparationTime = producerTime.getProgrammingTimeH();
        Duration deliveringTime = producerTime.getDeliveringTimeH();

        Duration executionTime = calcExecutionDuration(processingSpeedUnitpH, volumeUnit);

        return preparationTime.plus(executionTime.plus(deliveringTime));
    }


    private Duration calcExecutionDuration(long processingSpeedUnitpH, long volumeUnit) {

        long processingTimeH = volumeUnit / processingSpeedUnitpH;
        return Duration.ofHours(processingTimeH);








    }



}
