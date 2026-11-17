
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TransferBatchStatus {

    NotSet(0), Queued(1), Processing(2), Completed(3), Stopped(4), Failed(5), HeldForApproval(6);

    private int value;

    private TransferBatchStatus(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static TransferBatchStatus fromValue(int value) {
        for (TransferBatchStatus v : values()) {
            if (v.value == value) return v;
        }
        return null;
    }
}