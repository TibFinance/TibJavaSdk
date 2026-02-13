
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DasFieldType {

    NotSet(0), IdentificationNumber(1), FileType(2), FileNumber(3), DeclarationFrequency(4), Description(5), BusinessName(6), BusinessOrAccountNumber(7), PeriodStartDate(8), PeriodStartMonth(9), PeriodStartYear(10), PeriodEndDate(11), PeriodEndMonth(12), PeriodEndYear(13), WithhodingTax(14), RetirementPensionPlan(15), HealthServiceFund(16), ParentalInsurancePlan(17), CNESST(18), LastPayPeriodEmployeeCount(19), PeriodRawRemuneration(20), PaymentAmount(21);

    private int value;

    private DasFieldType(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}