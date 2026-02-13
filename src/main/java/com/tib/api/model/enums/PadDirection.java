
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PadDirection {

    Left(0), Right(1);

    private int value;

    private PadDirection(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}