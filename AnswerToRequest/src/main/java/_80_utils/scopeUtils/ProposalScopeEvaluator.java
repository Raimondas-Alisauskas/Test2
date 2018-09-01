package _80_utils.scopeUtils;

import _10_model.data.DASData;
import _30_producer.Producer;
import _50_request.Request;


public class ProposalScopeEvaluator {


    private Producer producer;
    private long maxFootprintDimensionMM;
    private long maxHeightMM;

    private long maxHeight;
    private long maxLength;
    private long maxWidth;
    private boolean producerScopeIsAvailable;


    public DASData<Producer> getScopeFitProposals(Request request, DASData<Producer> producersData) {

        for (int i = 0; i < producersData.getData().size(); i++) {
            producer = new Producer(i, producersData);

            checkProducerScopeAvailability();

            if (producerScopeIsAvailable) {

            }

        }

        return null;
    }

    private void checkProducerScopeAvailability() {
        producerScopeIsAvailable =;

    }
}
