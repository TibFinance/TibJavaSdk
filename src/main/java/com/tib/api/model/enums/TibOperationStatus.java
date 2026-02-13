
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TibOperationStatus {

    NotSet(0), New(1), InProgress(2), Failed(3), Abord(4), Success(5), Lost(6);

    private int value;

    private TibOperationStatus(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}