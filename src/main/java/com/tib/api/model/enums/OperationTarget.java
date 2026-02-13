
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OperationTarget {

    Unknown(-1), NotSet(0), Client(1), Merchant(2), TibClient(3), Wallet(4), Tib(100);

    private int value;

    private OperationTarget(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}