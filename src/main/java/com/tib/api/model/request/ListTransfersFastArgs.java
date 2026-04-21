
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.TransferType;
import com.tib.api.model.request.BaseAuthenticatedCryptedArgs;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class ListTransfersFastArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * The start date-time for the transfer search window.
     */
    @JsonProperty("FromDate")
    private OffsetDateTime fromDate;

    /**
     * Upper bound of the transfer creation date range for the query
     */
    @JsonProperty("ToDate")
    private OffsetDateTime toDate;

    /**
     * Identifier of the service for which recurring transfers are requested
     */
    @JsonProperty("ServiceId")
    private String serviceId;

    /**
     * The unique identifier of the merchant initiating the payment request.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * Identifier of the transfer group to filter the fast transfer list
     */
    @JsonProperty("TransferGroupId")
    private String transferGroupId;

    /**
     * Indicates the category of the recurring transfer (e.g., inbound, outbound, internal).
     */
    @JsonProperty("TransferType")
    private TransferType transferType;

    /**
     * If true, the request returns only transfers that are marked as resolved.
     */
    @JsonProperty("MarkResolvedOnly")
    private boolean markResolvedOnly;

    /**
     * Identifier of the external merchant group for which transfers are requested
     */
    @JsonProperty("ExternalMerchantGroupId")
    private String externalMerchantGroupId;

    /**
     * When true, ListTransfersFast returns only transfers that have errors.
     */
    @JsonProperty("OnlyWithErrors")
    private boolean onlyWithErrors;


    
    public ListTransfersFastArgs() {
    }

    
    public ListTransfersFastArgs(OffsetDateTime fromDate, OffsetDateTime toDate, String serviceId, String merchantId, String transferGroupId, TransferType transferType, boolean markResolvedOnly, String externalMerchantGroupId, boolean onlyWithErrors) {
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
    
    
    public ListTransfersFastArgs(String sessionToken, OffsetDateTime fromDate, OffsetDateTime toDate, String serviceId, String merchantId, String transferGroupId, TransferType transferType, boolean markResolvedOnly, String externalMerchantGroupId, boolean onlyWithErrors) {
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

    
    public OffsetDateTime getFromDate() {
        return fromDate;
    }

    public void setFromDate(OffsetDateTime fromDate) {
        this.fromDate = fromDate;
    }

    public OffsetDateTime getToDate() {
        return toDate;
    }

    public void setToDate(OffsetDateTime toDate) {
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