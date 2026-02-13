
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ProcessStatus {

    Unknown(-1), NotSet(0), New(1), Collect_Validation_Success_Success(2), Collect_Validation_Success_NoResultReturned(3), Collect_Validation_Success_Skip(4), Collect_Validation_Success_WaitManual(5), Collect_Validation_Success_Error(6), Collect_Validation_Error_Temporary(7), Collect_Validation_Error_Fatal(8), Collect_Transmission_Success_Success(9), Collect_Transmission_Success_NoResultReturned(10), Collect_Transmission_Success_Skip(11), Collect_Transmission_Success_WaitManual(12), Collect_Transmission_Success_Error(13), Collect_Transmission_Error_Temporary(14), Collect_Transmission_Error_Fatal(15), Collect_StatusCheck_Success_Success(16), Collect_StatusCheck_Success_NoResultReturned(17), Collect_StatusCheck_Success_Skip(18), Collect_StatusCheck_Success_WaitManual(19), Collect_StatusCheck_Success_Error(20), Collect_StatusCheck_Error_Temporary(21), Collect_StatusCheck_Error_Fatal(22), Collect_Payback_Success_Success(23), Collect_Payback_Success_NoResultReturned(24), Collect_Payback_Success_Skip(25), Collect_Payback_Success_WaitManual(26), Collect_Payback_Success_Error(27), Collect_Payback_Error_Temporary(28), Collect_Payback_Error_Fatal(29), Deposit_Validation_Success_Success(30), Deposit_Validation_Success_NoResultReturned(31), Deposit_Validation_Success_Skip(32), Deposit_Validation_Success_WaitManual(33), Deposit_Validation_Success_Error(34), Deposit_Validation_Error_Temporary(35), Deposit_Validation_Error_Fatal(36), Deposit_Transmission_Success_Success(37), Deposit_Transmission_Success_NoResultReturned(38), Deposit_Transmission_Success_Skip(39), Deposit_Transmission_Success_WaitManual(40), Deposit_Transmission_Success_Error(41), Deposit_Transmission_Error_Temporary(42), Deposit_Transmission_Error_Fatal(43), Deposit_StatusCheck_Success_Success(44), Deposit_StatusCheck_Success_NoResultReturned(45), Deposit_StatusCheck_Success_Skip(46), Deposit_StatusCheck_Success_WaitManual(47), Deposit_StatusCheck_Success_Error(48), Deposit_StatusCheck_Error_Temporary(49), Deposit_StatusCheck_Error_Fatal(50), Deposit_Payback_Success_Success(51), Deposit_Payback_Success_NoResultReturned(52), Deposit_Payback_Success_Skip(53), Deposit_Payback_Success_WaitManual(54), Deposit_Payback_Success_Error(55), Deposit_Payback_Error_Temporary(56), Deposit_Payback_Error_Fatal(57), Collect_Validation_NotSet(100), Collect_Transmission_NotSet(101), Collect_StatusCheck_NotSet(102), Collect_Payback_NotSet(103), Deposit_Validation_NotSet(104), Deposit_Transmission_NotSet(105), Deposit_StatusCheck_NotSet(106), Deposit_Payback_NotSet(107), Collect_Validation_Abort(108), Collect_Transmission_Abort(109), Collect_StatusCheck_Abort(110), Collect_Payback_Abort(111), Deposit_Validation_Abort(112), Deposit_Transmission_Abort(113), Deposit_StatusCheck_Abort(114), Deposit_Payback_Abort(115), Deposit_Immediate_Insufficient_Wallet_Balance_Abort(116), Collect_Transmission_Pending(117), Collect_StatusCheck_Pending(118), Deposit_Transmission_Pending(119), Deposit_StatusCheck_Pending(120), Authorization_Denied(900);

    private int value;

    private ProcessStatus(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}