
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AccountType {

    CustomerChecking(1), CustomerSaving(2), CorporateChecking(3), CorporateSaving(4);

    private int value;

    private AccountType(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}