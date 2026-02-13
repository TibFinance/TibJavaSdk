
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum BoardingDocType {

    unknown(-1), notSet(0), companyIdentificationProof(1), bankAccountIdentificationProof(2), person1IdentificationProof(3), person2IdentificationProof(4), shareholder1IdentificationProof(5), shareholder2IdentificationProof(6), shareholder3IdentificationProof(7), shareholder4IdentificationProof(8);

    private int value;

    private BoardingDocType(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}