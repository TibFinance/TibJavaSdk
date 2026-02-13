
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PaymentMethodTypeFlag {

    NotSet(0), CreditCard(1), DirectAccount(2), Interac(4);

    private int value;

    private PaymentMethodTypeFlag(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}