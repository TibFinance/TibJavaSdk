
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ErrorCode {

    InsufficientBalance(2000), TransmissionError(2001), NotValid(2003);

    private int value;

    private ErrorCode(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}