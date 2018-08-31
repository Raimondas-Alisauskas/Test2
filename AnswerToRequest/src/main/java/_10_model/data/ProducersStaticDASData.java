package _10_model.data;

import _30_producer.ProducerTime;

import java.util.ArrayList;
import java.util.List;

public class ProducersStaticDASData implements DASData<ProducerTime> {


    private  List<ProducerTime>  producersList = new ArrayList<>();

    /**
     * Use ProducersDBFactory
     */
    ProducersStaticDASData() {
       }


    @Override
    public List<ProducerTime> getData() {
        return producersList;
    }
}
