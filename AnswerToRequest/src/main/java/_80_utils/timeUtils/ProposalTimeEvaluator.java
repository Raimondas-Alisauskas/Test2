package _80_utils.timeUtils;

import _10_model.data.DASData;
import _30_producer.Producer;
import _60_proposal.Proposal;
import _50_request.Request;
import _80_utils.ProposalFiller;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ProposalTimeEvaluator {

    private ProductionDurationCalculator productionDurationCalculator;
    private ProducerAvailabilityCalculator producerAvailabilityCalculator;
    private Duration productionDuration;
    private boolean producerIsAvailable;
    private Producer producer;
    private Request request;
    private ArrayList timeFitProposalsList;
    private ProposalFiller proposalFiller;
    private LocalDateTime earlyFinishDate;
    private boolean productionIsOnTime;


    public List<Proposal> getTimeFitProducers(Request request, DASData<Producer> producersData) {
        this.request = request;
        productionDurationCalculator = new ProductionDurationCalculator();
        producerAvailabilityCalculator = new ProducerAvailabilityCalculator();
        timeFitProposalsList = new ArrayList();
        proposalFiller = new ProposalFiller();

        for (int i = 0; i < producersData.getData().size(); i++) {

            producer = new Producer(i, producersData);

            checkProducersAvailability();

            if (producerIsAvailable) {
                checkProductionIsOnTime();

                if (productionIsOnTime) {
                    putProposalToTimeFitProposalsList();
                }
            }
        }
        return timeFitProposalsList;
     }


    private void checkProducersAvailability() {
        // calculate productionDuration
        productionDuration = productionDurationCalculator.calcProductionDuration(request, producer);

        // calculate availability
       producerIsAvailable = producerAvailabilityCalculator.calculateProducerAvailability(producer, productionDuration);
    }


    private void checkProductionIsOnTime() {

        //calculate earlyFinishDate date of ProposalTime
        EarlyFinishDateCalculator earlyFinishDateCalculator = new EarlyFinishDateCalculator();
        earlyFinishDate = earlyFinishDateCalculator.calculateEarlyFinish(producer, productionDuration);

        //check Request's deadline
        LocalDateTime deadline = request.getRequestTime().getDeadline();

        productionIsOnTime = earlyFinishDate.isBefore(deadline);
    }


    private void putProposalToTimeFitProposalsList() {
        //create empty Proposal
        Proposal proposal = new Proposal();

        //fill ProposalTime
        proposal.getProposalTime().setEarlyFinish(earlyFinishDate);
        proposal = proposalFiller.fillProposal(proposal, request, producer);

        //put Proposal to timeFitProposalsList list
        timeFitProposalsList.add(proposal);
    }

}

