package com.tib.api.model.enums;

public enum BankOperationResult {

    NO_RESULT(0),
    CONFIRMED(1),
    OTHER_ERRORS(2),
    NSF(3),
    ACCOUNT_ERROR(4),
    OPPOSITION(5),
    INTERAC_REFUSED(6),
    INTERAC_FAILED(7);

    private int value;

    private BankOperationResult(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
