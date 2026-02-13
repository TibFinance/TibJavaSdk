
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TransferTypeFlag {

    NotSet(0), Payment(1), FreeCollection(2), PaymentAndFreeCollection(3), FreeDeposit(4), PaymentAndFreeDeposit(5), FreeCollectionAndFreeDeposit(6), All(7);

    private int value;

    private TransferTypeFlag(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}