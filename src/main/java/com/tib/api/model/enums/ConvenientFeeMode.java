
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ConvenientFeeMode {

    Unknown(-1), NotSet(0), NoFeeAuthorized(1), FeeWithRoundupOnPercentage(2), FeeWithRoundupOnAbsolute(3), RelativeToPaymentTypeFee(4);

    private int value;

    private ConvenientFeeMode(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}