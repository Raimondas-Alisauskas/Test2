package test.java;

import _10_model.data.DASData;
import _10_model.data.ProducersDBFactory;
import _30_producer.Producer;
import _30_producer.ProducerScope;
import _30_producer.ProducerTime;


public class TestDataPopulator {

    DASData<ProducerTime> producersTimeData;
    DASData<Producer> producersDASData;
    


     public TestDataPopulator() {
 //       this.producersTimeData = ProducersDBFactory.getDbInstance();
        this.producersDASData = ProducersDBFactory.getDbInstance();

         producersDASData.getData().add(new Producer
                 (new ProducerScope("","","",""),
                         new ProducerTime("","","","","")));






//         producersTimeData.getData().add( new ProducerTime( "1", "2018-09-10", "2018-09-15", "1", "24"));
//         producersTimeData.getData().add( new ProducerTime("P11", "2", "2018-09-01", "2018-10-15", "2", "12"));
//         producersTimeData.getData().add( new ProducerTime("P12", "1", "2018-09-10", "2018-09-12", "3", "18"));
//         producersTimeData.getData().add( new ProducerTime("P13", "2", "2018-09-20", "2018-10-01", "1", "24"));
//         producersTimeData.getData().add( new ProducerTime("P13", "2", "2018-09-20", "2018-10-01", "1", "24"));

     }

//   public  void putProducerData ( DASData<ProducerTime> producersTimeData) {
//        producersTimeData.getData().add( new ProducerTime("P10", "1", "2018-09-10", "2018-09-15", "1", "24"));
//        producersTimeData.getData().add( new ProducerTime("P11", "2", "2018-09-01", "2018-10-15", "2", "12"));
//        producersTimeData.getData().add( new ProducerTime("P12", "1", "2018-09-10", "2018-09-12", "3", "18"));
//        producersTimeData.getData().add( new ProducerTime("P13", "2", "2018-09-20", "2018-10-01", "1", "24"));
//
//    }



}


//    private List<ProducerTime> producersList;
//    private  List<Request> requestsList;
//    private  List<ProposalsStaticDASData> proposalsList;
//    private  List<List<ProposalsStaticDASData>> proposalsDatalist;
//    public TestDataPopulator() {
//        this.producersList = producersList;


//
//        this.requestsList = requestsList;
//        //    public RequestsStaticDASData() {
////    requestsList = new ArrayList<>();
////        requestsList.add(0, new Request("C10", "100", "100", "2018-09-15"));
////        requestsList.add(1, new Request("C1", "200", "200", "2018-09-10"));
////        requestsList.add(2, new Request("C2", "200", "100", "2018-09-20"));
////        requestsList.add(3, new Request("C3", "300", "300", "2018-09-10"));
////    }
//
//        this.proposalsList = proposalsList;
//
//        this.proposalsDatalist = proposalsDatalist;
//    }

