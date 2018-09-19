package _70_answer;

import _30_producer.Producer;
import _60_proposal.Proposal;
import _80_utils.IdGenerator;

import java.util.List;

public class Answer {

    private String answerId = new IdGenerator().generateIdKey("Ans ");
    private List<Proposal> timeFitProposals;

    public List<Proposal> getTimeFitProposals() {
        return timeFitProposals;
    }

    public void setTimeFitProposals(List<Proposal> timeFitProposals) {
        this.timeFitProposals = timeFitProposals;
    }
}
