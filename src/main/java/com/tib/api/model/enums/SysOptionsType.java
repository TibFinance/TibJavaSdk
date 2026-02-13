
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SysOptionsType {

    TargetMerchantFeesRedeposit(1);

    private int value;

    private SysOptionsType(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}