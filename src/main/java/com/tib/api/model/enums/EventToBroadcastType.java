
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum EventToBroadcastType {

    NotSet(0), TransactionEventToBroadcast(1), BatchFileEventToBroadcast(2), BoardingEventToBroadcast(3), TransferPendingProcessEventToBroadcast(4);

    private int value;

    private EventToBroadcastType(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}