
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PaymentFilterLevel {

    Service(0), Merchant(1), Bill(2);

    private int value;

    private PaymentFilterLevel(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}