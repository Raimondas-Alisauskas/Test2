package _30_producer;

import _10_model.data.DASData;

public class ProducerScope {


    private long maxHeight;
    private long maxLength;
    private long maxWidth;
    private long processingSpeedCM3pH;

    //for manual data input
    public ProducerScope(String maxHeight, String maxLength, String maxWidth, String processingSpeedCM3pH) {
        this.maxHeight = Long.valueOf(maxHeight);
        this.maxLength = Long.valueOf(maxLength);
        this.maxWidth = Long.valueOf(maxWidth);
        this.processingSpeedCM3pH = Long.valueOf(processingSpeedCM3pH);
    }


/*
    //for calculations
    public ProducerScope(int i, DASData<Producer> producersData) {
        this.maxHeight = producersData.getData().get(i).getProducerScope().getMaxHeight();
        this.maxLength = producersData.getData().get(i).getProducerScope().getMaxLength();
        this.maxWidth = producersData.getData().get(i).getProducerScope().getMaxWidth();
        this.processingSpeedCM3pH = producersData.getData().get(i).getProducerScope().getProcessingSpeedCM3pH();
    }
*/

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
