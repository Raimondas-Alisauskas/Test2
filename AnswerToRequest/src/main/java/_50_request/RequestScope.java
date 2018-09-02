package _50_request;

public class RequestScope {

    private long maxHeightMM;
    private long maxLengthMM;
    private long maxWidthMM;

    private long volumeCM3;

    //for calculations
    public RequestScope(long maxHeightMM, long maxLengthMM, long maxWidthMM, long volumeCM3) {
        this.maxHeightMM = maxHeightMM;
        this.maxLengthMM = maxLengthMM;
        this.maxWidthMM = maxWidthMM;
        this.volumeCM3 = volumeCM3;
    }

    //for manual input
    public RequestScope( String maxHeightMM, String maxLengthMM, String maxWidthMM, String volumeCM3) {
        this.maxHeightMM = Long.valueOf(maxHeightMM);
        this.maxLengthMM = Long.valueOf(maxLengthMM);
        this.maxWidthMM = Long.valueOf(maxWidthMM);
        this.volumeCM3 = Long.valueOf(volumeCM3);
    }

    public long getMaxHeightMM() {
        return maxHeightMM;
    }

    public void setMaxHeightMM(long maxHeightMM) {
        this.maxHeightMM = maxHeightMM;
    }

    public long getMaxLengthMM() {
        return maxLengthMM;
    }

    public void setMaxLengthMM(long maxLengthMM) {
        this.maxLengthMM = maxLengthMM;
    }

    public long getMaxWidthMM() {
        return maxWidthMM;
    }

    public void setMaxWidthMM(long maxWidthMM) {
        this.maxWidthMM = maxWidthMM;
    }

    public long getVolumeCM3() {
        return volumeCM3;
    }

    public void setVolumeCM3(long volumeCM3) {
        this.volumeCM3 = volumeCM3;
    }
}
