
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ValidationLimitStatus {

    NoErrors(0), LimitPerBankAccountDailyReach(1), LimitPerBankAccountPerDelaysReach(2), NumberPerBankAccountDailyReach(4), NumberPerBankAccountPerDelaysReach(8), LimitReach(16), LimitDailyReach(32), LimitClientDailyReach(64);

    private int value;

    private ValidationLimitStatus(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}