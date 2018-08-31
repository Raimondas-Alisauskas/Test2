package _80_utils;

import _30_producer.ProducerTime;

import java.time.Duration;
import java.time.LocalDateTime;

public class ProducerAvailabilityCalculator {

    // availability evaluated for 24/7 ProducerTime's worktime
    public boolean calculateProducerAvailability(ProducerTime producerTime, Duration productionDuration) {

        LocalDateTime availableStart = producerTime.getAvailableStart();
        LocalDateTime availableFinish = producerTime.getAvailableFinish();

        return availableStart.plus(productionDuration).isBefore(availableFinish);
    }

}
