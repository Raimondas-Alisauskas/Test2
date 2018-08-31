package _80_utils;

import _10_model.data.DASData;
import _30_producer.Producer;
import _30_producer.ProducerScope;
import _30_producer.ProducerTime;
import _60_proposal.Proposal;
import _60_proposal.ProposalScope;
import _60_proposal.ProposalTime;
import _50_request.Request;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ProposalTimeEvaluator {


    public List<ProposalTime> getTimeFitProducers(Request request, DASData<Producer> producersData) {

        ProductionDurationCalculator productionDurationCalculator = new ProductionDurationCalculator();
        ProducerAvailabilityCalculator producerAvailabilityCalculator = new ProducerAvailabilityCalculator();
        EarlyFinishDateCalculator earlyFinishDateCalculator = new EarlyFinishDateCalculator();
        ProposalFiller proposalFiller = new ProposalFiller();
        List<ProposalTime> timeFitProducers = new ArrayList();


        for (int i = 0; i < producersData.getData().size(); i++) {

            Producer producer = new Producer(i, producersData);

//            ProducerScope producerScope = new ProducerScope(i, producersData);
//            ProducerTime producerTime = new ProducerTime(i, producersData);

            /**
             Producer producer = new Producer(i, producersData);

             // calculate productionDuration
             Duration productionDuration = productionDurationCalculator.calcProductionDuration(request, producer);

             // calculate availability
             boolean producerAvailable = producerAvailabilityCalculator.calculateProducerAvailability(producer, productionDuration);

             if (producerAvailable) {

             //calculate earlyFinishDate date of ProposalTime
             LocalDateTime earlyFinishDate = earlyFinishDateCalculator.calculateEarlyFinish(producer, productionDuration);

             //check Request's deadline
             LocalDateTime deadline = request.getRequestTime().getDeadline();
             boolean productionIsOnTime = earlyFinishDate.isBefore(deadline);

             if (productionIsOnTime) {

             //create empty Proposal
             Proposal proposal = new Proposal();

             //fill ProposalTime
             proposal.setEarlyFinishDate(earlyFinishDate);
             proposal = proposalFiller.fillProposal(proposal, request, producer);

             //put ProposalTime to proposalsList
             timeFitProducers.add(proposal);
             }

             }*/
        }
        return timeFitProducers;
    }


}

