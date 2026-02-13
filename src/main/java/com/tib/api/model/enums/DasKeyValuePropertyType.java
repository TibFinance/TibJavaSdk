
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DasKeyValuePropertyType {

    StringValue(0), IntValue(1), DecimalValue(2), DasDate(3), DasMonthlyDate(4);

    private int value;

    private DasKeyValuePropertyType(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}