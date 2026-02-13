
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum LineType {

    A(1), D(2), C(3), Z(4);

    private int value;

    private LineType(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}