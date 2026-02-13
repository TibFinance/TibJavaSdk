
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DasProviderType {

    NotSet(0), RevenuQuebec(1), CanadaRevenueAgancy(2);

    private int value;

    private DasProviderType(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}