package _50_request;

public class RequestScope {

    private long maxFootprintDimensionMM;
    private long maxHeightMM;
    private long volumeCM3;

    //for calculations
    public RequestScope(long maxFootprintDimensionMM, long maxHeightMM, long volumeCM3) {
        this.maxFootprintDimensionMM = maxFootprintDimensionMM;
        this.maxHeightMM = maxHeightMM;
        this.volumeCM3 = volumeCM3;
    }

    //for manual input
    public RequestScope(String maxFootprintDimensionMM, String maxHeightMM, String volumeCM3) {
        this.maxFootprintDimensionMM = Long.valueOf(maxFootprintDimensionMM);
        this.maxHeightMM = Long.valueOf(maxHeightMM);
        this.volumeCM3 = Long.valueOf(volumeCM3);
    }

    public long getMaxFootprintDimensionMM() {
        return maxFootprintDimensionMM;
    }

    public void setMaxFootprintDimensionMM(long maxFootprintDimensionMM) {
        this.maxFootprintDimensionMM = maxFootprintDimensionMM;
    }

    public long getMaxHeightMM() {
        return maxHeightMM;
    }

    public void setMaxHeightMM(long maxHeightMM) {
        this.maxHeightMM = maxHeightMM;
    }

    public long getVolumeCM3() {
        return volumeCM3;
    }

    public void setVolumeCM3(long volumeCM3) {
        this.volumeCM3 = volumeCM3;
    }
}
