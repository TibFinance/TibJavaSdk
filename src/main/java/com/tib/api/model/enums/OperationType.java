
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OperationType {

    Unknown(-1), NotSet(0), Validation(1), Transmission(2), StatusCheck(3), Payback(4);

    private int value;

    private OperationType(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}