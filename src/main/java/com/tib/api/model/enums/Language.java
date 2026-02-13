
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Language {

    Unkown(-1), NotSet(0), French(1), English(2);

    private int value;

    private Language(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}