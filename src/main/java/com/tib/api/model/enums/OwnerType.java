
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OwnerType {

    NotSet(0), Tib(1), Client(2);

    private int value;

    private OwnerType(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}