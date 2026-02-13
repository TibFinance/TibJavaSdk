
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CompanyType {

    Unkown(-1), NotSet(0), JointStockCompany(1), LimitedCompany(2), Partnership(3), PublicCompany(4), PublicAdministration(5), NonprofitOrganization(6), SoleProprietorship(7);

    private int value;

    private CompanyType(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}