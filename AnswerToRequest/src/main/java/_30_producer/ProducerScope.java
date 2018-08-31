package _30_producer;

import _80_utils.IdGenerator;

public class ProducerScope implements Producer{


    //id
    private String producerId = new IdGenerator().generateIdKey("Pr ");

    public String getProducerId() {
        return producerId;
    }

    public void setProducerId(String producerId) {
        this.producerId = producerId;
    }





}
