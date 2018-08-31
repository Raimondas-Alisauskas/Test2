package _80_utils;

import _30_producer.ProducerTime;
import _50_request.Request;
import _60_proposal.ProposalTime;

public class ProposalFiller {

    public ProposalTime fillProposal(ProposalTime proposalTime, Request request, ProducerTime producerTime) {
        proposalTime.setRequestId(request.getRequestId());
        proposalTime.setProducerId(producerTime.getProducerId());
        proposalTime.setAvailableStart(producerTime.getAvailableStart());
        proposalTime.setAvailableFinish(producerTime.getAvailableFinish());
        return proposalTime;
    }

}
