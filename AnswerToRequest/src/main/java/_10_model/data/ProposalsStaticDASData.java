package _10_model.data;

import _60_proposal.ProposalTime;

import java.util.ArrayList;
import java.util.List;

public class ProposalsStaticDASData implements DASData<ProposalTime> {

 //   private String requestId;
    private List<ProposalTime> proposalTimes = new ArrayList<>();

    /**
     * Use ProducersDBFactory
     */
    ProposalsStaticDASData() {
    }

    @Override
    public List<ProposalTime> getData() {
        return proposalTimes;
    }

}



