
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Provider {

    Unknown(-1), NotSet(0), CA_CreditCard_Moneris(1000), CA_CreditCard_BankOfAmerica(1001), CA_Account_Desjardins(1100), CA_Account_RBC(1101), CA_Interac_RBC(1200), RBC_ARN(3000);

    private int value;

    private Provider(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static Provider fromValue(int value) {
        for (Provider v : values()) {
            if (v.value == value) return v;
        }
        return null;
    }
}