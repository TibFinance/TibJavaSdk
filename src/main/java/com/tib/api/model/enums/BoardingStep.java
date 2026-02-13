
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum BoardingStep {

    CompanyInfoRejected(-2), Unkown(-1), NotSet(0), ClientCreated(1), LoginCreated(2), CompanyInfoToValidate(3), CompanyInfoValidated(4);

    private int value;

    private BoardingStep(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}