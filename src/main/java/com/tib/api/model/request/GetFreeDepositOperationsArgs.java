
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.request.BaseAuthenticatedCryptedArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class GetFreeDepositOperationsArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
 * Specifies the starting date for filtering payment due dates.
 */
    @JsonProperty("FromDate")
    private LocalDateTime fromDate;

    /**
 * Specifies the payment due date.
 */
    @JsonProperty("ToDate")
    private LocalDateTime toDate;

    /**
 * Identifies the group of related transfer operations.
 */
    @JsonProperty("TransferGroupId")
    private String transferGroupId;

    /**
 * Indicates whether the transfer list should be filtered to include only operations that have an error status.
 */
    @JsonProperty("OnlyWithErrors")
    private boolean onlyWithErrors;

    /**
 * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
 */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
 * Generates a unique identifier for a specific service to facilitate the creation of a customer list.
 */
    @JsonProperty("ServiceId")
    private String serviceId;


    
    public GetFreeDepositOperationsArgs() {
    }

    
    public GetFreeDepositOperationsArgs(LocalDateTime fromDate, LocalDateTime toDate, String transferGroupId, boolean onlyWithErrors, String merchantId, String serviceId) {
        this.fromDate = fromDate;
this.toDate = toDate;
this.transferGroupId = transferGroupId;
this.onlyWithErrors = onlyWithErrors;
this.merchantId = merchantId;
this.serviceId = serviceId;

    }
    
    
    public GetFreeDepositOperationsArgs(String sessionToken, LocalDateTime fromDate, LocalDateTime toDate, String transferGroupId, boolean onlyWithErrors, String merchantId, String serviceId) {
        super(sessionToken);
        this.fromDate = fromDate;
this.toDate = toDate;
this.transferGroupId = transferGroupId;
this.onlyWithErrors = onlyWithErrors;
this.merchantId = merchantId;
this.serviceId = serviceId;

    }

    
    public LocalDateTime getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDateTime getToDate() {
        return toDate;
    }

    public void setToDate(LocalDateTime toDate) {
        this.toDate = toDate;
    }

    public String getTransferGroupId() {
        return transferGroupId;
    }

    public void setTransferGroupId(String transferGroupId) {
        this.transferGroupId = transferGroupId;
    }

    public boolean getOnlyWithErrors() {
        return onlyWithErrors;
    }

    public void setOnlyWithErrors(boolean onlyWithErrors) {
        this.onlyWithErrors = onlyWithErrors;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetFreeDepositOperationsArgs that = (GetFreeDepositOperationsArgs) o;
        return Objects.equals(fromDate, that.fromDate) && Objects.equals(toDate, that.toDate) && Objects.equals(transferGroupId, that.transferGroupId) && Objects.equals(onlyWithErrors, that.onlyWithErrors) && Objects.equals(merchantId, that.merchantId) && Objects.equals(serviceId, that.serviceId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(fromDate, toDate, transferGroupId, onlyWithErrors, merchantId, serviceId);
    }

    @Override
    public String toString() {
        return "GetFreeDepositOperationsArgs{" +
                 "fromDate='" + fromDate + '\'' +
 ", toDate='" + toDate + '\'' +
 ", transferGroupId='" + transferGroupId + '\'' +
 ", onlyWithErrors='" + onlyWithErrors + '\'' +
 ", merchantId='" + merchantId + '\'' +
 ", serviceId='" + serviceId + '\'' +

                '}';
    }
}