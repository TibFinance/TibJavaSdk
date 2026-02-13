
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CountryId {

    Unkown(-1), NotSet(0), Canada(1), USA(2);

    private int value;

    private CountryId(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}