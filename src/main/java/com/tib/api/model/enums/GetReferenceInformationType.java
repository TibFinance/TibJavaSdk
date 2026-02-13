
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum GetReferenceInformationType {

    NotSet(0), Service(1);

    private int value;

    private GetReferenceInformationType(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}