
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DateType {

    Unkown(-1), NotSet(0), CreatedDate(1), LastModifiedDate(2);

    private int value;

    private DateType(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DateType fromValue(int value) {
        for (DateType v : values()) {
            if (v.value == value) return v;
        }
        return null;
    }
}