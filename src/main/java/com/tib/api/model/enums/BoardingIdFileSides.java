
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum BoardingIdFileSides {

    NotSet(0), Front(1), Back(2);

    private int value;

    private BoardingIdFileSides(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}