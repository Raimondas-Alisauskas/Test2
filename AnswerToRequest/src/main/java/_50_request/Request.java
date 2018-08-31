package _50_request;

import _80_utils.IdGenerator;

public class Request extends RequestTime3D implements IRequest{

    //id
    private String requestId;
    private String clientName; // TODO: Stage2  Sukurti atpazinima ar tai senas ar naujas klientas. Deti i ClientsData jei naujas

    public Request() {
        this.requestId = new IdGenerator().generateIdKey("Rk ");
    }

    //for manual input
    public Request(String clientName, String maxDimensionsMM, String volumeCM3, String deadline) {
        super(maxDimensionsMM, volumeCM3, deadline);
        this.requestId = new IdGenerator().generateIdKey("Rk ");
        this.clientName = clientName;
    }


    //getset
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
}


//    todo  Stage2
//    //price
//    private double maxPrice; //
//
//    //priorities
//    private double prioritiesTime; //
//    private double prioritiesPrice;  //
//
//        maxPrice = Double.parseDouble(requestInput.getMaxPrice());
//
//        prioritiesTime = Double.parseDouble(requestInput.getTimePriority());
//
//        prioritiesPrice = Double.parseDouble(requestInput.getPricePriority());



