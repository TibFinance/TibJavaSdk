
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ReferenceType {

    NotSet(0), Client(1), Service(2), Merchant(3);

    private int value;

    private ReferenceType(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}