
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CheckFeesMode {

    Unknown(-1), FeesOnEachCall(0), FeesOnEachCallOnlyFound(1), OncePerMonth(2), OncePerMonthOnlyIfFound(3), NoFees(4);

    private int value;

    private CheckFeesMode(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}