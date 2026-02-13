
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum WhitelabelingLevels {

    Default(-1), NotSet(0), Merchant(1), Service(2), Client(3), Url(4);

    private int value;

    private WhitelabelingLevels(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}