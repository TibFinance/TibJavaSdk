
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum BoardingStatus {

    NotSet(0), Draft(1), Submit(11), InReview(12), Completed(13), ValidationError(21), DocumentsRequired(22), Rejected(23), DocumentsSubmitted(24);

    private int value;

    private BoardingStatus(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}