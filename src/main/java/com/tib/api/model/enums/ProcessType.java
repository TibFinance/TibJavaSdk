
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ProcessType {

    Unknown(-1), NotSet(0), Collect(1), Deposit(2), CheckStatus(3), CheckPayback(4), GatherAccountInfo(5), TransmitAccountingFile(6), QuickInterac(7), BuildTransactionsCacheFile(8), SendAllBills(9), CollectPortalFee(10), SendAllCommissions(11);

    private int value;

    private ProcessType(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}