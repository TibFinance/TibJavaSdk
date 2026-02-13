
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum FinancialSettingsDataContext {

    NotSet(0), DefaultClientSettings(1), DefaultClientServiceSettings(2), ClientSettings(3), ClientDefaultServiceSettings(4), ServiceSettings(5), MerchantSettings(6);

    private int value;

    private FinancialSettingsDataContext(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}