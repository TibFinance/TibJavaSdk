
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DeletedPublicTokenReason {

    NotSet(0), Consumed(1), Expired(2), Canceled(3), WeSentYouNewLogin(9);

    private int value;

    private DeletedPublicTokenReason(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}