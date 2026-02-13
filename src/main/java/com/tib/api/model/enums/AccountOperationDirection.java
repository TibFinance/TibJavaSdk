
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AccountOperationDirection {

    Unknown(-1), NotSet(0), Withdraw(1), Deposit(2);

    private int value;

    private AccountOperationDirection(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}