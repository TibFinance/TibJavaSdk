
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PaymentFlowParsingResult {

    Unkown(-1), NoError(0), Success(1), InvalidPaymentFlow(2), BillNotRelatedToKnownCustomer(3), BillKnownCustomerHasNoPaymentMethod(4), BillKnownCustomerHasNoAutoPaymentSet(5), ForcedPaymentMethodIdNeeded(6), BillKnownCustomerDoesntHaveSpecifiedPaymentMethodId(7), AnonymousMustHaveEmail(8), CustomerPPAConsentIsNeeded(9);

    private int value;

    private PaymentFlowParsingResult(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}