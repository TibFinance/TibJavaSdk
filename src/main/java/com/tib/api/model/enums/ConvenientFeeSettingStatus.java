
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ConvenientFeeSettingStatus {

    NotSet(0), Active(1), Inactive(2), Deleted(3);

    private int value;

    private ConvenientFeeSettingStatus(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}