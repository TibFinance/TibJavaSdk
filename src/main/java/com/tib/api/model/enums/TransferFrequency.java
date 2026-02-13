
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TransferFrequency {

    NotSet(-1), Once(0), Daily(1), Weekly(2), EveryTwoWeeks(3), Monthly(4), Trimester(5), BiAnually(6), Anually(7);

    private int value;

    private TransferFrequency(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}