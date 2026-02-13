
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
}