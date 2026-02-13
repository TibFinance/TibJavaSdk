
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Provider {

    Unknown(-1), NotSet(0), Sandbox_Account(100), Sandbox_CreditCard(200), Sandbox_Interac(300), Sandbox_ARN(400), Sandbox_BlueSnap_Account_USD(101), Sandbox_BlueSnap_Account_CAD(102), Sandbox_BlueSnap_CreditCard_USD(201), Sandbox_BlueSnap_CreditCard_CAD(202), CA_CreditCard_Moneris(1000), CA_CreditCard_BankOfAmerica(1001), CA_Account_Desjardins(1100), CA_Account_RBC(1101), CA_Interac_RBC(1200), RBC_ARN(3000), BlueSnap_CreditCard_USD(4000), BlueSnap_Account_USD(4001), BlueSnap_CreditCard_CAD(4002), BlueSnap_Account_CAD(4003);

    private int value;

    private Provider(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}