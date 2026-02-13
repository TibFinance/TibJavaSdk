
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum WalletAdjustment {

    NotSet(0), IncreaseWallet(2), DecreaseWallet(4);

    private int value;

    private WalletAdjustment(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}