
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum FlagPermission {

    None(0), Admin(1), Client(2), Merchant(4), Customer(8), Service(16);

    private int value;

    private FlagPermission(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}