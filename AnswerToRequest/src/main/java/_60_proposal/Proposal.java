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
        this.proposalId =  new IdGenerator().generateIdKey("Prp ");
        this.proposalScope = new ProposalScope();
        this.proposalTime = new ProposalTime();

    }

//    public Proposal(String requestId, String producerId, ProposalScope proposalScope, ProposalTime proposalTime) {
//        this.proposalId = new IdGenerator().generateIdKey("Pr ");
//        this.requestId = requestId;
//        this.producerId = producerId;
//        this.proposalScope = proposalScope;
//        this.proposalTime = proposalTime;
//    }

    public String getProposalId() {
        return proposalId;
    }

    public void setProposalId(String proposalId) {
        this.proposalId = proposalId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getProducerId() {
        return producerId;
    }

    public void setProducerId(String producerId) {
        this.producerId = producerId;
    }

    public ProposalScope getProposalScope() {
        return proposalScope;
    }

    public void setProposalScope(ProposalScope proposalScope) {
        this.proposalScope = proposalScope;
    }

    public ProposalTime getProposalTime() {
        return proposalTime;
    }

    public void setProposalTime(ProposalTime proposalTime) {
        this.proposalTime = proposalTime;
    }
}
