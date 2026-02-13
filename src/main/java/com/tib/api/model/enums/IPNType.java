
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum IPNType {

    NotSet(0), MERCHANT_PARTNER_ONBOARDED(1), APPLICATION_DOCUMENT_REQUEST(2), CHARGEBACK_FILE_UPLOADED(3);

    private int value;

    private IPNType(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}