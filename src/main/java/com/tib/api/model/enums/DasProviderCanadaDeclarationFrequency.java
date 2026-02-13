
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DasProviderCanadaDeclarationFrequency {

    NotSet(0), Weekly(1), TwiceMonthly(2), Monthly(3), Quarterly(4);

    private int value;

    private DasProviderCanadaDeclarationFrequency(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}