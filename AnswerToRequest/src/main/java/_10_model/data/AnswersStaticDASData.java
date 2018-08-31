package _10_model.data;

import _60_proposal.ProposalTime;
import _70_answer.Answer;

import java.util.ArrayList;
import java.util.List;

public class AnswersStaticDASData implements DASData<Answer> {


    private  List<Answer> answersList = new ArrayList<>();

    /**
     * Use ProducersDBFactory
     */
     AnswersStaticDASData() {
      }

    @Override
    public List<Answer> getData() { return answersList; }

}
