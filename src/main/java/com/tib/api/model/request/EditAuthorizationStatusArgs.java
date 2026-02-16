
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.TibAuthorizationStatus;
import com.tib.api.model.request.BaseAdminOnlyCryptedArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class EditAuthorizationStatusArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
     * Retrieves or assigns the unique identifier for a payment.
     */
    @JsonProperty("PaymentId")
    private String paymentId;

    /**
     * 
     */
    @JsonProperty("AuthorizationStatus")
    private TibAuthorizationStatus authorizationStatus;


    
    public EditAuthorizationStatusArgs() {
    }

    
    public EditAuthorizationStatusArgs(String paymentId, TibAuthorizationStatus authorizationStatus) {
        this.paymentId = paymentId;
        this.authorizationStatus = authorizationStatus;
    }
    
    
    public EditAuthorizationStatusArgs(String adminSessionToken, String paymentId, TibAuthorizationStatus authorizationStatus) {
        super(adminSessionToken);
        this.paymentId = paymentId;
        this.authorizationStatus = authorizationStatus;
    }

    
    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public TibAuthorizationStatus getAuthorizationStatus() {
        return authorizationStatus;
    }

    public void setAuthorizationStatus(TibAuthorizationStatus authorizationStatus) {
        this.authorizationStatus = authorizationStatus;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EditAuthorizationStatusArgs that = (EditAuthorizationStatusArgs) o;
        return Objects.equals(paymentId, that.paymentId) && Objects.equals(authorizationStatus, that.authorizationStatus) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(paymentId, authorizationStatus);
    }

    @Override
    public String toString() {
        return "EditAuthorizationStatusArgs{" +
                "paymentId='" + paymentId + '\'' +
                ", authorizationStatus='" + authorizationStatus + '\'' +

                '}';
    }
}