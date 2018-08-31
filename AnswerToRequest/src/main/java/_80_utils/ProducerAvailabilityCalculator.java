package _80_utils;

import _30_producer.Producer;
import _30_producer.ProducerTime;

import java.time.Duration;
import java.time.LocalDateTime;

public class ProducerAvailabilityCalculator {

    // availability evaluated for 24/7 ProducerTime's worktime
    public boolean calculateProducerAvailability(Producer producer, Duration productionDuration) {

        LocalDateTime availableStart = producer.getProducerTime().getAvailableStart();
        LocalDateTime availableFinish = producer.getProducerTime().getAvailableFinish();

        return availableStart.plus(productionDuration).isBefore(availableFinish);
    }

}
