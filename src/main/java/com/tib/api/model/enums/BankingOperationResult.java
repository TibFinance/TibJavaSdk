
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum BankingOperationResult {

    Unknown(-1), NotSet(0), Confirmed(1), ErrorOther(2), NoFund(3), AccountError(4), Opposition(5), InteracRefused(6), InteracFailed(7);

    private int value;

    private BankingOperationResult(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}