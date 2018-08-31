package _30_producer;

import _80_utils.IdGenerator;

public interface Producer {

    //id
    String producerId = new IdGenerator().generateIdKey("");

    String getProducerId();

   void setProducerId (String producerId);

}
