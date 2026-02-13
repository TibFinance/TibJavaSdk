
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DataSummaryAggregationCategory {

    Unknown(-1), NotSet(0), TodayCollections(1), TodayDeposits(2), TodayCashback(3), PendingCollections(4), PendingDeposits(5);

    private int value;

    private DataSummaryAggregationCategory(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}