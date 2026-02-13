
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TransferType {

    NotSet(0), Payment(1), FreeDeposit(2), FreeCollection(3), Fee(4), Revert(5), PaymentAndFreeCollection(6), Commission(7), DepositToWallet(8), CollectFromWallet(9), DepositToWalletFromInterac(10);

    private int value;

    private TransferType(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}