
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AcpTransactionType {

    Collection(0), Deposit(1);

    private int value;

    private AcpTransactionType(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}