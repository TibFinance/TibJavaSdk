
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ClientAuthorizationStatus {

    NotRequired(0), NeedApprobation(1), Approved(2), Rejected(3);

    private int value;

    private ClientAuthorizationStatus(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}