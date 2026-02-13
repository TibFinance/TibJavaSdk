
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PublicAccessTokenRoutingType {

    NotSet(0), Transfer(1), AnonymousPayment(2), CreateService(3), PendingChange(4), KnowCustomerPayment(5), DropIn(6), SignUp(8), Boarding(9), BoardingContract(10), ChangePassword(11), ExternalSupplierFinancialInformationsRequest(12), ExternalSupplierReadOnlyPortalLink(13);

    private int value;

    private PublicAccessTokenRoutingType(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}