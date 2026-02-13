package com.tib.api.model.enums;

public enum AuthorizedPaymentMethodType {

    UNKNOWN(-1) ,NOT_SET(0) , CREDIT_CARD(1) ,DIRECT_ACCOUNT(2);

    private int value;

    private AuthorizedPaymentMethodType(int value) {
        this.value =value;
    }

    public int getValue() {
        return value;
    }
}
