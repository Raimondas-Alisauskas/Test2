package _60_proposal;

import _80_utils.IdGenerator;

import java.time.LocalDateTime;

public class ProposalTime extends Proposal {

    //id
    private String proposalId;
    private String requestId;
    private String producerId;

    public ProposalTime() {
        this.proposalId = new IdGenerator().generateIdKey("Pr ");
    }

    //for manual input
    public ProposalTime(String requestId, String producerId,
                        LocalDateTime availableStart, LocalDateTime availableFinish, LocalDateTime earlyFinish) {
        super(availableStart, availableFinish, earlyFinish);
        this.proposalId = new IdGenerator().generateIdKey("Pr ");
        this.requestId = requestId;
        this.producerId = producerId;

    }

    //getset

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
}
// TODO: 18.8.18 Stage2
////price
//private double proposalPrice;
//
//    //score
//    private int score;