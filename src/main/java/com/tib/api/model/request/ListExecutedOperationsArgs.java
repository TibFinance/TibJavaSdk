
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.TransferTypeFlag;
import com.tib.api.model.enums.DateType;
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


public class ListExecutedOperationsArgs  extends BaseAuthenticatedCryptedArgs  {

    
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
     * Indicates the category of the recurring transfer (e.g., inbound, outbound, internal).
     */
    @JsonProperty("TransferType")
    private TransferTypeFlag transferType;

    /**
     * Identifier of the transfer group to filter the fast transfer list
     */
    @JsonProperty("TransferGroupId")
    private String transferGroupId;

    /**
     * When true, ListTransfersFast returns only transfers that have errors.
     */
    @JsonProperty("OnlyWithErrors")
    private boolean onlyWithErrors;

    /**
     * The unique identifier of the merchant initiating the payment request.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * Which date field to use for the date range filter (CreatedDate or LastModifiedDate).
     */
    @JsonProperty("DateType")
    private DateType dateType;

    /**
     * Identifier of the service for which recurring transfers are requested
     */
    @JsonProperty("ServiceId")
    private String serviceId;


    
    public ListExecutedOperationsArgs() {
    }

    
    public ListExecutedOperationsArgs(OffsetDateTime fromDate, OffsetDateTime toDate, TransferTypeFlag transferType, String transferGroupId, boolean onlyWithErrors, String merchantId, DateType dateType, String serviceId) {
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.transferType = transferType;
        this.transferGroupId = transferGroupId;
        this.onlyWithErrors = onlyWithErrors;
        this.merchantId = merchantId;
        this.dateType = dateType;
        this.serviceId = serviceId;
    }
    
    
    public ListExecutedOperationsArgs(String sessionToken, OffsetDateTime fromDate, OffsetDateTime toDate, TransferTypeFlag transferType, String transferGroupId, boolean onlyWithErrors, String merchantId, DateType dateType, String serviceId) {
        super(sessionToken);
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.transferType = transferType;
        this.transferGroupId = transferGroupId;
        this.onlyWithErrors = onlyWithErrors;
        this.merchantId = merchantId;
        this.dateType = dateType;
        this.serviceId = serviceId;
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

    public TransferTypeFlag getTransferType() {
        return transferType;
    }

    public void setTransferType(TransferTypeFlag transferType) {
        this.transferType = transferType;
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

    public DateType getDateType() {
        return dateType;
    }

    public void setDateType(DateType dateType) {
        this.dateType = dateType;
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
        ListExecutedOperationsArgs that = (ListExecutedOperationsArgs) o;
        return Objects.equals(fromDate, that.fromDate) && Objects.equals(toDate, that.toDate) && Objects.equals(transferType, that.transferType) && Objects.equals(transferGroupId, that.transferGroupId) && Objects.equals(onlyWithErrors, that.onlyWithErrors) && Objects.equals(merchantId, that.merchantId) && Objects.equals(dateType, that.dateType) && Objects.equals(serviceId, that.serviceId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(fromDate, toDate, transferType, transferGroupId, onlyWithErrors, merchantId, dateType, serviceId);
    }

    @Override
    public String toString() {
        return "ListExecutedOperationsArgs{" +
                "fromDate='" + fromDate + '\'' +
                ", toDate='" + toDate + '\'' +
                ", transferType='" + transferType + '\'' +
                ", transferGroupId='" + transferGroupId + '\'' +
                ", onlyWithErrors='" + onlyWithErrors + '\'' +
                ", merchantId='" + merchantId + '\'' +
                ", dateType='" + dateType + '\'' +
                ", serviceId='" + serviceId + '\'' +

                '}';
    }
}