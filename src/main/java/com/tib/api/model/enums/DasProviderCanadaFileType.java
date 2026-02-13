
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DasProviderCanadaFileType {

    NotSet(0), FileType_RP(1);

    private int value;

    private DasProviderCanadaFileType(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}