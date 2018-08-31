package _80_utils;

import _30_producer.ProducerTime;

import java.time.Duration;
import java.time.LocalDateTime;

public class EarlyFinishDateCalculator {


    public LocalDateTime calculateEarlyFinish(ProducerTime producerTime, Duration productionDuration) {

        LocalDateTime availableStart = producerTime.getAvailableStart();
        Duration deliveringTime = producerTime.getDeliveringTimeH();

        return availableStart.plus(productionDuration).plus(deliveringTime);
    }


}

