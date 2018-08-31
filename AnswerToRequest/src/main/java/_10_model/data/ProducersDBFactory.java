package _10_model.data;

import _30_producer.ProducerTime;

public class ProducersDBFactory {

    private static DASData<ProducerTime> dbInstance = null;

    public static DASData <ProducerTime>getDbInstance(){


        if (dbInstance == null) {
            dbInstance = creteDbInstance();
        }
        return dbInstance;
    }

    private static DASData<ProducerTime> creteDbInstance(){
        //config mode
        int mode = 0;//For static data mode

       switch (mode){
           case 0:
               return new ProducersStaticDASData();
           default:
               break;
        }
        throw new RuntimeException("Not existing mode type"); // TODO: 18.8.22 Make test
    }
}
