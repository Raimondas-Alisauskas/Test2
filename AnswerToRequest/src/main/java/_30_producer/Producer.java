package _30_producer;

import _80_utils.IdGenerator;

public class Producer {

    private String producerId ;
    private ProducerScope producerScope;
    private ProducerTime producerTime;

    //for calculations
    public Producer( ProducerScope producerScope, ProducerTime producerTime) {
        this.producerId = new IdGenerator().generateIdKey("Pr ");
        this.producerScope = producerScope;
        this.producerTime = producerTime;
    }

    //for manual data input
    public Producer( String producerId, ProducerScope producerScope, ProducerTime producerTime) {
        this.producerId = producerId;
        this.producerScope = producerScope;
        this.producerTime = producerTime;
    }

    public String getProducerId() {
        return producerId;
    }

    public void setProducerId(String producerId) {
        this.producerId = producerId;
    }

    public ProducerScope getProducerScope() {
        return producerScope;
    }

    public void setProducerScope(ProducerScope producerScope) {
        this.producerScope = producerScope;
    }

    public ProducerTime getProducerTime() {
        return producerTime;
    }

    public void setProducerTime(ProducerTime producerTime) {
        this.producerTime = producerTime;
    }
}
