
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.PaymentFilterLevel;
import com.tib.api.model.enums.TransferTypeFlag;
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


public class ListTransfersArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * Specifies the hierarchical level used when querying payments, indicating which data table the LevelFilterId applies to. A null value selects payments from all client levels.
     */
    @JsonProperty("PaymentFilterLevel")
    private PaymentFilterLevel paymentFilterLevel;

    /**
     * Identifies the Service, Merchant, or Bill entity referenced by the PaymentFilterLevel.
     */
    @JsonProperty("LevelFilterId")
    private String levelFilterId;

    /**
     * Indicates whether the request should consider only payments that are already marked as resolved.
     */
    @JsonProperty("MarkResolvedOnly")
    private boolean markResolvedOnly;

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
     * Defines and manages the type of transfer operation within the system.
     */
    @JsonProperty("TransferType")
    private TransferTypeFlag transferType;

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


    
    public ListTransfersArgs() {
    }

    
    public ListTransfersArgs(PaymentFilterLevel paymentFilterLevel, String levelFilterId, boolean markResolvedOnly, LocalDateTime fromDate, LocalDateTime toDate, String transferGroupId, TransferTypeFlag transferType, String externalMerchantGroupId, boolean onlyWithErrors) {
        this.paymentFilterLevel = paymentFilterLevel;
        this.levelFilterId = levelFilterId;
        this.markResolvedOnly = markResolvedOnly;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.transferGroupId = transferGroupId;
        this.transferType = transferType;
        this.externalMerchantGroupId = externalMerchantGroupId;
        this.onlyWithErrors = onlyWithErrors;
    }
    
    
    public ListTransfersArgs(String sessionToken, PaymentFilterLevel paymentFilterLevel, String levelFilterId, boolean markResolvedOnly, LocalDateTime fromDate, LocalDateTime toDate, String transferGroupId, TransferTypeFlag transferType, String externalMerchantGroupId, boolean onlyWithErrors) {
        super(sessionToken);
        this.paymentFilterLevel = paymentFilterLevel;
        this.levelFilterId = levelFilterId;
        this.markResolvedOnly = markResolvedOnly;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.transferGroupId = transferGroupId;
        this.transferType = transferType;
        this.externalMerchantGroupId = externalMerchantGroupId;
        this.onlyWithErrors = onlyWithErrors;
    }

    
    public PaymentFilterLevel getPaymentFilterLevel() {
        return paymentFilterLevel;
    }

    public void setPaymentFilterLevel(PaymentFilterLevel paymentFilterLevel) {
        this.paymentFilterLevel = paymentFilterLevel;
    }

    public String getLevelFilterId() {
        return levelFilterId;
    }

    public void setLevelFilterId(String levelFilterId) {
        this.levelFilterId = levelFilterId;
    }

    public boolean getMarkResolvedOnly() {
        return markResolvedOnly;
    }

    public void setMarkResolvedOnly(boolean markResolvedOnly) {
        this.markResolvedOnly = markResolvedOnly;
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

    public TransferTypeFlag getTransferType() {
        return transferType;
    }

    public void setTransferType(TransferTypeFlag transferType) {
        this.transferType = transferType;
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
        ListTransfersArgs that = (ListTransfersArgs) o;
        return Objects.equals(paymentFilterLevel, that.paymentFilterLevel) && Objects.equals(levelFilterId, that.levelFilterId) && Objects.equals(markResolvedOnly, that.markResolvedOnly) && Objects.equals(fromDate, that.fromDate) && Objects.equals(toDate, that.toDate) && Objects.equals(transferGroupId, that.transferGroupId) && Objects.equals(transferType, that.transferType) && Objects.equals(externalMerchantGroupId, that.externalMerchantGroupId) && Objects.equals(onlyWithErrors, that.onlyWithErrors) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(paymentFilterLevel, levelFilterId, markResolvedOnly, fromDate, toDate, transferGroupId, transferType, externalMerchantGroupId, onlyWithErrors);
    }

    @Override
    public String toString() {
        return "ListTransfersArgs{" +
                "paymentFilterLevel='" + paymentFilterLevel + '\'' +
                ", levelFilterId='" + levelFilterId + '\'' +
                ", markResolvedOnly='" + markResolvedOnly + '\'' +
                ", fromDate='" + fromDate + '\'' +
                ", toDate='" + toDate + '\'' +
                ", transferGroupId='" + transferGroupId + '\'' +
                ", transferType='" + transferType + '\'' +
                ", externalMerchantGroupId='" + externalMerchantGroupId + '\'' +
                ", onlyWithErrors='" + onlyWithErrors + '\'' +

                '}';
    }
}