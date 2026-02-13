
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CredentialType {

    AccountCollect(1), PasswordCollect(2), AccountDeposit(3), PasswordDeposit(4), Address(5), KeyValuePair(6), Question(7), ProviderId(8), MerchantCredentials(9);

    private int value;

    private CredentialType(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}