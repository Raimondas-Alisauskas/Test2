package _10_model.input;

public class RequestInput {

    //id
    private String clientName;
    private String maxFootprintDimensionMM;
    private String maxHeightMM;
    private String volumeCM3;
    //time
    private String deadline;


    public RequestInput() {
        clientName = "ClName";
        maxFootprintDimensionMM = "100";
        maxHeightMM = "200";
        volumeCM3 = "100";
        deadline = "2018-09-15";
    }

    //getset
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getMaxFootprintDimensionMM() {
        return maxFootprintDimensionMM;
    }

    public void setMaxFootprintDimensionMM(String maxFootprintDimensionMM) {
        this.maxFootprintDimensionMM = maxFootprintDimensionMM;
    }

    public String getMaxHeightMM() {
        return maxHeightMM;
    }

    public void setMaxHeightMM(String maxHeightMM) {
        this.maxHeightMM = maxHeightMM;
    }

    public String getVolumeCM3() {
        return volumeCM3;
    }

    public void setVolumeCM3(String volumeCM3) {
        this.volumeCM3 = volumeCM3;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
}

// TODO: 18.8.18 Stage 2
//    //price
//    private String maxPrice;
//
//    //priorities
//    private String timePriority;
//    private String pricePriority;

//        maxPrice = "200";
////        timePriority = "30";
////        pricePriority = "70";