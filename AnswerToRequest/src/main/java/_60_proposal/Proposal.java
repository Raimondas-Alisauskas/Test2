package _60_proposal;

import _80_utils.IdGenerator;

public class Proposal {


    private String proposalId;
    private String requestId;
    private String producerId;
    private ProposalScope proposalScope;
    private ProposalTime proposalTime;

    //empty Proposal


    public Proposal() {
        this.proposalId =  new IdGenerator().generateIdKey("Pr ");
    }

//    public Proposal(String requestId, String producerId, ProposalScope proposalScope, ProposalTime proposalTime) {
//        this.proposalId = new IdGenerator().generateIdKey("Pr ");
//        this.requestId = requestId;
//        this.producerId = producerId;
//        this.proposalScope = proposalScope;
//        this.proposalTime = proposalTime;
//    }

}
