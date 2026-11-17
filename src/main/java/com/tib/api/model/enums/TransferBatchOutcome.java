
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TransferBatchOutcome {

    Processed(1), Refused(2), Validated(3), Accepted(4);

    private int value;

    private TransferBatchOutcome(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static TransferBatchOutcome fromValue(int value) {
        for (TransferBatchOutcome v : values()) {
            if (v.value == value) return v;
        }
        return null;
    }
}