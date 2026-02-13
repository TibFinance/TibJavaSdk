
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PaymentFlow {

    Unkown(-1), NotSet(0), AnonymousOnlinePayment(1), KnownCustomerMustUsePresavedPaymentMethod(2), KnownCustomerCanManagePaymentMethod(3), KnownCustomerCanSetAutoPaymentMethod(4), KnownCustomerAutoPaymentUsingPreference(5), KnownCustomerAutoPaymentForcePaymentMethod(6), AutoSelectEasier(7), AutoSelectEasierExceptAutoPayment(8);

    private int value;

    private PaymentFlow(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}