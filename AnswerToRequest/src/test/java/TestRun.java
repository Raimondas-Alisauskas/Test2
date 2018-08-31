
import _10_model.data.*;
import _30_producer.ProducerTime;
import _50_request.Request;
import _60_proposal.ProposalTime;
import main.java.App;

public class TestRun {

    public static void main(String[] args) {

        DASData<Request> requestData = RequestsDBFactory.getDASInstance();
        DASData<ProducerTime> producersData = ProducersDBFactory.getDbInstance();
        DASData<ProposalTime> proposalsData = ProposalsDBFactory.getDbInstance();
        DASData<DASData<ProposalTime>> answersData = AnswersDBFactory.getDbInstance();

        test.java.TestDataPopulator testDataPopulator = new test.java.TestDataPopulator();
//        testDataPopulator.putProducerData(testDataPopulator.producersData);

        App app = new main.java.App(requestData, producersData, proposalsData, answersData);
        app.runApp();


    }

}
