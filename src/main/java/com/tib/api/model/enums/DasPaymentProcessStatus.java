
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DasPaymentProcessStatus {

    NotSet(0), New(1), MoneyCollected(2), ReadyToSend(3), PaymentSent(4), PaymentAccepted(5), Cancelled(10), Reverted(11), ErrorCollectingMoney(100), ErrorPreparingPayment(101), ErrorSendingPayment(102);

    private int value;

    private DasPaymentProcessStatus(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}