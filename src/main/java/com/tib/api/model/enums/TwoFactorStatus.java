
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TwoFactorStatus {

    NotRequired(0), CodeRequired(1), SetupRequired(2), Verified(3), InvalidCode(4), SecurityVerificationRequired(5), SecurityVerificationFailed(6), SecurityVerificationUnavailable(7);

    private int value;

    private TwoFactorStatus(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}