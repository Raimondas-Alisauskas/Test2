
import _10_model.data.*;
import _30_producer.Producer;
import _30_producer.ProducerTime;
import _50_request.Request;
import _60_proposal.Proposal;
import _60_proposal.ProposalTime;
import _70_answer.Answer;

import java.util.List;

public class TestRun {

    public static void main(String[] args) {

        DASData<Request> requestData = RequestsDBFactory.getDASInstance();
        DASData<Producer> producersData = ProducersDBFactory.getDbInstance();
//        DASData<Proposal> proposalsData = ProposalsDBFactory.getDbInstance();
        DASData<Answer> answersData = AnswersDBFactory.getDbInstance();

        test.java.TestDataPopulator testDataPopulator = new test.java.TestDataPopulator();
//        testDataPopulator.putProducerData(testDataPopulator.producersData);

        App app = new App(requestData, producersData, answersData);
        app.runApp();

        List<Proposal> timeFitProposals = answersData.getData().get(0).getTimeFitProposals();
        for (int i = 0; i < timeFitProposals.size(); i++) {
            System.out.println("timeUtils fit proposals id :" + timeFitProposals.get(i).getProposalId());
        }
    }

}


