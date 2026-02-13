
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OperationStatus {

    Unknown(-1), NotSet(0), Success_Success(1), Success_NoResultReturned(2), Success_Skip(3), Success_WaitManual(4), Success_Error(10), Error_Temporary(11), Error_Fatal(12), Abort(13);

    private int value;

    private OperationStatus(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}