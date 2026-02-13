
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DasProviderQuebecFileType {

    NotSet(0), FileType_RS(1), FileType_11(2);

    private int value;

    private DasProviderQuebecFileType(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}