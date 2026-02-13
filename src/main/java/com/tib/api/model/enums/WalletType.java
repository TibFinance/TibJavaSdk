
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum WalletType {

    Schedule(1), Manual(2), Automatic(3);

    private int value;

    private WalletType(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}