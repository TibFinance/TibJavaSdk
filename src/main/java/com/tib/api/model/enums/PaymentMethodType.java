
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PaymentMethodType {

    Unknown(-1), NotSet(0), CreditCard(1), DirectAccount(2), Interac(3);

    private int value;

    private PaymentMethodType(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}