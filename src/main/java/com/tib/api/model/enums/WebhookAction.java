
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum WebhookAction {

    CollectSuccess(1), DepositSuccess(2);

    private int value;

    private WebhookAction(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}