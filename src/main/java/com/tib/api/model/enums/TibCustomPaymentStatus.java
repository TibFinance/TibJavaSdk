
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TibCustomPaymentStatus {

    Pending(0), InProgress(1), RevertedPending(2), Completed(3), RevertedCompleted(4), Error(5), Canceled(6);

    private int value;

    private TibCustomPaymentStatus(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}