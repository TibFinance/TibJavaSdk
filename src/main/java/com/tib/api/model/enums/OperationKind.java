
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OperationKind {

    Unknown(-1), NotSet(0), Payment(1), FreeDeposit(2), FreeCollection(3), FeePayment(4), FeeFreeDeposit(5), FeeFreeCollection(6), ReturnCharge(10), FileFees(11), Refund(12), TibCollect(13), AccountCheckNsfFees(14), AccountCheckOppositionFees(15), AccountCheckNsfFeesHit(16), AccountCheckOppositionFeesHit(17), FeeReverseCharge(18), RevertedOperation(19), ConvenientFee(20), RevertConvenientFee(21), PlatformFee(22), GatewayUsageFee(23), SupportFee(24), WalletCollect(25), GroupedFees(100), FeesRetransfer(101);

    private int value;

    private OperationKind(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}