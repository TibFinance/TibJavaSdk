
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TransferDirection {

    Unknown(-1), NotSet(0), Collect(1), Deposit(2);

    private int value;

    private TransferDirection(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}