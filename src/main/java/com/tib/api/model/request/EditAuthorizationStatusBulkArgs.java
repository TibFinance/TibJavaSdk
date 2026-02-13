
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


public class EditAuthorizationStatusBulkArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
 * 
 */
    @JsonProperty("PaymentIds")
    private List<String> paymentIds;

    /**
 * 
 */
    @JsonProperty("AuthorizationStatus")
    private TibAuthorizationStatus authorizationStatus;


    
    public EditAuthorizationStatusBulkArgs() {
    }

    
    public EditAuthorizationStatusBulkArgs(List<String> paymentIds, TibAuthorizationStatus authorizationStatus) {
        this.paymentIds = paymentIds;
this.authorizationStatus = authorizationStatus;

    }
    
    
    public EditAuthorizationStatusBulkArgs(String adminSessionToken, List<String> paymentIds, TibAuthorizationStatus authorizationStatus) {
        super(adminSessionToken);
        this.paymentIds = paymentIds;
this.authorizationStatus = authorizationStatus;

    }

    
    public List<String> getPaymentIds() {
        return paymentIds;
    }

    public void setPaymentIds(List<String> paymentIds) {
        this.paymentIds = paymentIds;
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
        EditAuthorizationStatusBulkArgs that = (EditAuthorizationStatusBulkArgs) o;
        return Objects.equals(paymentIds, that.paymentIds) && Objects.equals(authorizationStatus, that.authorizationStatus) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(paymentIds, authorizationStatus);
    }

    @Override
    public String toString() {
        return "EditAuthorizationStatusBulkArgs{" +
                 "paymentIds='" + paymentIds + '\'' +
 ", authorizationStatus='" + authorizationStatus + '\'' +

                '}';
    }
}