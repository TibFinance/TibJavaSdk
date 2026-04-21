
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum FeeMode {

    Unknown(-1), NotSet(0), Fix(1), RelativeToPaymentTypeFee(2), FixUsingRoundUp(3);

    private int value;

    private FeeMode(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static FeeMode fromValue(int value) {
        for (FeeMode v : values()) {
            if (v.value == value) return v;
        }
        return null;
    }
}