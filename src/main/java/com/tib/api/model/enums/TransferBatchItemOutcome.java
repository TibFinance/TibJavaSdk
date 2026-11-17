
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TransferBatchItemOutcome {

    Created(1), AlreadyCreated(2), Refused(3), NotProcessed(4), Valid(5), Accepted(6);

    private int value;

    private TransferBatchItemOutcome(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static TransferBatchItemOutcome fromValue(int value) {
        for (TransferBatchItemOutcome v : values()) {
            if (v.value == value) return v;
        }
        return null;
    }
}