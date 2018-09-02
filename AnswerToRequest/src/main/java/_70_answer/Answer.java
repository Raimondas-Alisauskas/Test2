package _70_answer;

import _60_proposal.Proposal;
import _80_utils.IdGenerator;

import java.util.List;

public class Answer {

    private String answerId = new IdGenerator().generateIdKey("Ans ");
    private List<Proposal> ProposalsInAnswer;

    public List<Proposal> getProposalsInAnswer() {
        return ProposalsInAnswer;
    }

    public void setProposalsInAnswer(List<Proposal> proposalsInAnswer) {
        this.ProposalsInAnswer = proposalsInAnswer;
    }
}
