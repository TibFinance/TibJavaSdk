
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AutorizedPaymentMethodFlags {

    NotSet(0), CreditCard(1), DirectAccount(2), CreditCardPPA(4), DirectAccountPPA(8), Interac(16);

    private int value;

    private AutorizedPaymentMethodFlags(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}