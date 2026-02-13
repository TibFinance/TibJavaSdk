
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum FeatureToggleType {

    Unknown(-1), NotSet(0), ftr_wallet(1), NewWallet(2);

    private int value;

    private FeatureToggleType(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}