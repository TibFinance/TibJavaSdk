package com.tib.api.model.enums;

public enum TransactionTransferType {

    UNKNOWN(-1),
    NotSet(0),
    Payment(1),
    FreeCollection(2),
    PaymentAndFreeCollection(3),
    FreeDeposit(4),
    PAYMENT_AND_FREE_DEPOSIT(5),
    FREE_COLLECTION_AND_FREE_DEPOSIT(6),
    ALL(7);

    private int value;

    private TransactionTransferType(int value) {
        this.value =value;
    }

    public int getValue() {
        return value;
    }
}
