
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum FreeDepositAccountType {

    Unkown(-1), NotSet(0), DirectToAccount(1), RelatedToCustomer(2);

    private int value;

    private FreeDepositAccountType(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}