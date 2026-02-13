
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ContractRequestStatus {

    Unkown(-1), NotSet(0), Waiting(1), Processed(2);

    private int value;

    private ContractRequestStatus(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}