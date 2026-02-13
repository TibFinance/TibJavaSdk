
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OperationCategoryReportType {

    Deposit(0), Collection(1), Transmitted(2), Bill(3), CancelFast(4), CancelLate(5), Payback(6), Transaction(7), UserCanceled(8);

    private int value;

    private OperationCategoryReportType(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}