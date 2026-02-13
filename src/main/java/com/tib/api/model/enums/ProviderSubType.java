
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ProviderSubType {

    RBC_ARN(0);

    private int value;

    private ProviderSubType(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}