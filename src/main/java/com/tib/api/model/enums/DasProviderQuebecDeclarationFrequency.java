
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DasProviderQuebecDeclarationFrequency {

    NotSet(0), Weekly(1), TwiceMonthly(2), Monthly(3), Quarterly(4), Annually(5);

    private int value;

    private DasProviderQuebecDeclarationFrequency(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}