
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TibAuthorizationStatus {

    NotRequired(0), WaitingForClientApprobation(1), Required(2), Approved(3), Declined(4);

    private int value;

    private TibAuthorizationStatus(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}