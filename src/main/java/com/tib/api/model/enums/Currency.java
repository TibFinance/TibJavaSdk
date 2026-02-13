
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Currency {

    Unkown(-1), NotSet(0), CAD(1), USD(2), EUR(3), GBP(4);

    private int value;

    private Currency(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}