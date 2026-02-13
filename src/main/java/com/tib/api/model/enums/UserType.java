
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum UserType {

    Admin(0), User(1);

    private int value;

    private UserType(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}