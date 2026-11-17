
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TransferBatchCustomerAction {

    None(0), Created(1), Updated(2), Unchanged(3), Recreated(4), NotStored(5);

    private int value;

    private TransferBatchCustomerAction(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static TransferBatchCustomerAction fromValue(int value) {
        for (TransferBatchCustomerAction v : values()) {
            if (v.value == value) return v;
        }
        return null;
    }
}