
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.TransferType;
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


public class ListTransfersFastArgs  extends BaseAuthenticatedCryptedArgs  {

    
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
 * Generates a unique identifier for a specific service to facilitate the creation of a customer list.
 */
    @JsonProperty("ServiceId")
    private String serviceId;

    /**
 * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
 */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
 * Identifies the group of related transfer operations.
 */
    @JsonProperty("TransferGroupId")
    private String transferGroupId;

    /**
 * Defines and manages the type of transfer operation within the system.
 */
    @JsonProperty("TransferType")
    private TransferType transferType;

    /**
 * Indicates whether the request should consider only payments that are already marked as resolved.
 */
    @JsonProperty("MarkResolvedOnly")
    private boolean markResolvedOnly;

    /**
 * External merchant group identifier used to filter transfer operations.
 */
    @JsonProperty("ExternalMerchantGroupId")
    private String externalMerchantGroupId;

    /**
 * Indicates whether the transfer list should be filtered to include only operations that have an error status.
 */
    @JsonProperty("OnlyWithErrors")
    private boolean onlyWithErrors;


    
    public ListTransfersFastArgs() {
    }

    
    public ListTransfersFastArgs(LocalDateTime fromDate, LocalDateTime toDate, String serviceId, String merchantId, String transferGroupId, TransferType transferType, boolean markResolvedOnly, String externalMerchantGroupId, boolean onlyWithErrors) {
        this.fromDate = fromDate;
this.toDate = toDate;
this.serviceId = serviceId;
this.merchantId = merchantId;
this.transferGroupId = transferGroupId;
this.transferType = transferType;
this.markResolvedOnly = markResolvedOnly;
this.externalMerchantGroupId = externalMerchantGroupId;
this.onlyWithErrors = onlyWithErrors;

    }
    
    
    public ListTransfersFastArgs(String sessionToken, LocalDateTime fromDate, LocalDateTime toDate, String serviceId, String merchantId, String transferGroupId, TransferType transferType, boolean markResolvedOnly, String externalMerchantGroupId, boolean onlyWithErrors) {
        super(sessionToken);
        this.fromDate = fromDate;
this.toDate = toDate;
this.serviceId = serviceId;
this.merchantId = merchantId;
this.transferGroupId = transferGroupId;
this.transferType = transferType;
this.markResolvedOnly = markResolvedOnly;
this.externalMerchantGroupId = externalMerchantGroupId;
this.onlyWithErrors = onlyWithErrors;

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

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getTransferGroupId() {
        return transferGroupId;
    }

    public void setTransferGroupId(String transferGroupId) {
        this.transferGroupId = transferGroupId;
    }

    public TransferType getTransferType() {
        return transferType;
    }

    public void setTransferType(TransferType transferType) {
        this.transferType = transferType;
    }

    public boolean getMarkResolvedOnly() {
        return markResolvedOnly;
    }

    public void setMarkResolvedOnly(boolean markResolvedOnly) {
        this.markResolvedOnly = markResolvedOnly;
    }

    public String getExternalMerchantGroupId() {
        return externalMerchantGroupId;
    }

    public void setExternalMerchantGroupId(String externalMerchantGroupId) {
        this.externalMerchantGroupId = externalMerchantGroupId;
    }

    public boolean getOnlyWithErrors() {
        return onlyWithErrors;
    }

    public void setOnlyWithErrors(boolean onlyWithErrors) {
        this.onlyWithErrors = onlyWithErrors;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListTransfersFastArgs that = (ListTransfersFastArgs) o;
        return Objects.equals(fromDate, that.fromDate) && Objects.equals(toDate, that.toDate) && Objects.equals(serviceId, that.serviceId) && Objects.equals(merchantId, that.merchantId) && Objects.equals(transferGroupId, that.transferGroupId) && Objects.equals(transferType, that.transferType) && Objects.equals(markResolvedOnly, that.markResolvedOnly) && Objects.equals(externalMerchantGroupId, that.externalMerchantGroupId) && Objects.equals(onlyWithErrors, that.onlyWithErrors) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(fromDate, toDate, serviceId, merchantId, transferGroupId, transferType, markResolvedOnly, externalMerchantGroupId, onlyWithErrors);
    }

    @Override
    public String toString() {
        return "ListTransfersFastArgs{" +
                 "fromDate='" + fromDate + '\'' +
 ", toDate='" + toDate + '\'' +
 ", serviceId='" + serviceId + '\'' +
 ", merchantId='" + merchantId + '\'' +
 ", transferGroupId='" + transferGroupId + '\'' +
 ", transferType='" + transferType + '\'' +
 ", markResolvedOnly='" + markResolvedOnly + '\'' +
 ", externalMerchantGroupId='" + externalMerchantGroupId + '\'' +
 ", onlyWithErrors='" + onlyWithErrors + '\'' +

                '}';
    }
}