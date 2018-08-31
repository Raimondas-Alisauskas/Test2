package _10_model.data;

import _60_proposal.ProposalTime;

public class ProposalsDBFactory  {

    private static DASData<ProposalTime> dbInstance = null;

    public static DASData<ProposalTime> getDbInstance(){


        if (dbInstance == null) {
            dbInstance = creteDbInstance();
        }
        return dbInstance;
    }

    private static DASData<ProposalTime> creteDbInstance(){
        //config mode
        int mode = 0;//For static data mode

       switch (mode){
           case 0:
               return new ProposalsStaticDASData();
           default:
               break;
        }
        throw new RuntimeException("Not existing mode type"); // TODO: 18.8.22 Make test
    }
}
