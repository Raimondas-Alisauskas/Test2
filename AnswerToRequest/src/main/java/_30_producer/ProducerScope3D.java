package _30_producer;

public class ProducerScope3D extends ProducerScope{

    private long maxHeight;
    private long maxLength;
    private long maxWidth;
    private long processingSpeedCM3pH;


//getset
    public long getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(long maxHeight) {
        this.maxHeight = maxHeight;
    }

    public long getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(long maxLength) {
        this.maxLength = maxLength;
    }

    public long getMaxWidth() {
        return maxWidth;
    }

    public void setMaxWidth(long maxWidth) {
        this.maxWidth = maxWidth;
    }

    public long getProcessingSpeedCM3pH() {
        return processingSpeedCM3pH;
    }

    public void setProcessingSpeedCM3pH(long processingSpeedCM3pH) {
        this.processingSpeedCM3pH = processingSpeedCM3pH;
    }
}
