package _80_utils;

import _10_model.data.DASData;
import _30_producer.ProducerTime;
import _30_producer.ProducerTime3D;
import _60_proposal.ProposalTime;
import _50_request.Request;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ProposalTimeEvaluator {


    public List<ProposalTime> getTimeFitProducers(Request request, DASData<ProducerTime> producersData) {

        ProductionDurationCalculator productionDurationCalculator = new ProductionDurationCalculator();
        ProducerAvailabilityCalculator producerAvailabilityCalculator = new ProducerAvailabilityCalculator();
        EarlyFinishDateCalculator earlyFinishDateCalculator = new EarlyFinishDateCalculator();
        ProposalFiller proposalFiller = new ProposalFiller();
        List<ProposalTime> timeFitProducers = new ArrayList();


        for (int i = 0; i < producersData.getData().size(); i++) {
            ProducerTime producerTime = new ProducerTime(i, producersData);

            // calculate productionDuration
            Duration productionDuration = productionDurationCalculator.calcProductionDuration(request, producerTime);

            // calculate availability
            boolean producerAvailable = producerAvailabilityCalculator.calculateProducerAvailability(producerTime, productionDuration);

            if (producerAvailable) {

                //calculate earlyFinishDate date of ProposalTime
                LocalDateTime earlyFinishDate = earlyFinishDateCalculator.calculateEarlyFinish(producerTime, productionDuration);

                //check Request's deadline
                LocalDateTime deadline = request.getDeadline();
                boolean productionIsOnTime = earlyFinishDate.isBefore(deadline);

                if (productionIsOnTime) {

                    //create empty ProposalTime
                    ProposalTime proposalTime = new ProposalTime();

                    //fill ProposalTime
                    proposalTime.setEarlyFinishDate(earlyFinishDate);
                    proposalTime = proposalFiller.fillProposal(proposalTime, request, producerTime);

                    //put ProposalTime to proposalsList
                    timeFitProducers.add(proposalTime);
                }

            }
        }
        return timeFitProducers;
    }


}

