
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Job {

    NotSet(0), OperationCreation(1);

    private int value;

    private Job(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}