
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AcpFileType {

    Acp(0), Perceptech(1);

    private int value;

    private AcpFileType(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}