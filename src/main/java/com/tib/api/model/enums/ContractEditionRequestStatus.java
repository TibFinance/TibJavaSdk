
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ContractEditionRequestStatus {

    Waiting(1), Processed(2);

    private int value;

    private ContractEditionRequestStatus(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}