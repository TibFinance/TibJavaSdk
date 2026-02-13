
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ProviderRefIdType {

    NotSet(0), Merchant(1), Service(2);

    private int value;

    private ProviderRefIdType(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}