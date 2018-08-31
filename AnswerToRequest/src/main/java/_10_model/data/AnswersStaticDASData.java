package _10_model.data;

import _60_proposal.ProposalTime;

import java.util.ArrayList;
import java.util.List;

public class AnswersStaticDASData implements DASData<DASData<ProposalTime>> {


    private  List<DASData<ProposalTime>> answersList = new ArrayList<>();

    /**
     * Use ProducersDBFactory
     */
     AnswersStaticDASData() {
      }

    @Override
    public List<DASData<ProposalTime>> getData() { return answersList; }

}
