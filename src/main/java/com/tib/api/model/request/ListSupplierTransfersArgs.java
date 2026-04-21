
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
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


public class ListSupplierTransfersArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * The unique identifier of the merchant initiating the payment request.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

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
     * When true, ListTransfersFast returns only transfers that have errors.
     */
    @JsonProperty("OnlyWithErrors")
    private boolean onlyWithErrors;

    /**
     * If true, the request returns only transfers that are marked as resolved.
     */
    @JsonProperty("MarkResolvedOnly")
    private boolean markResolvedOnly;

    /**
     * Identifier of the transfer group to filter the fast transfer list
     */
    @JsonProperty("TransferGroupId")
    private String transferGroupId;

    /**
     * Optional filter to show only transfers for a specific supplier. When set, filters by Transfer.RelatedMerchantId == SupplierMerchantId.
     */
    @JsonProperty("SupplierMerchantId")
    private String supplierMerchantId;


    
    public ListSupplierTransfersArgs() {
    }

    
    public ListSupplierTransfersArgs(String merchantId, OffsetDateTime fromDate, OffsetDateTime toDate, boolean onlyWithErrors, boolean markResolvedOnly, String transferGroupId, String supplierMerchantId) {
        this.merchantId = merchantId;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.onlyWithErrors = onlyWithErrors;
        this.markResolvedOnly = markResolvedOnly;
        this.transferGroupId = transferGroupId;
        this.supplierMerchantId = supplierMerchantId;
    }
    
    
    public ListSupplierTransfersArgs(String sessionToken, String merchantId, OffsetDateTime fromDate, OffsetDateTime toDate, boolean onlyWithErrors, boolean markResolvedOnly, String transferGroupId, String supplierMerchantId) {
        super(sessionToken);
        this.merchantId = merchantId;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.onlyWithErrors = onlyWithErrors;
        this.markResolvedOnly = markResolvedOnly;
        this.transferGroupId = transferGroupId;
        this.supplierMerchantId = supplierMerchantId;
    }

    
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
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

    public boolean getOnlyWithErrors() {
        return onlyWithErrors;
    }

    public void setOnlyWithErrors(boolean onlyWithErrors) {
        this.onlyWithErrors = onlyWithErrors;
    }

    public boolean getMarkResolvedOnly() {
        return markResolvedOnly;
    }

    public void setMarkResolvedOnly(boolean markResolvedOnly) {
        this.markResolvedOnly = markResolvedOnly;
    }

    public String getTransferGroupId() {
        return transferGroupId;
    }

    public void setTransferGroupId(String transferGroupId) {
        this.transferGroupId = transferGroupId;
    }

    public String getSupplierMerchantId() {
        return supplierMerchantId;
    }

    public void setSupplierMerchantId(String supplierMerchantId) {
        this.supplierMerchantId = supplierMerchantId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListSupplierTransfersArgs that = (ListSupplierTransfersArgs) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(fromDate, that.fromDate) && Objects.equals(toDate, that.toDate) && Objects.equals(onlyWithErrors, that.onlyWithErrors) && Objects.equals(markResolvedOnly, that.markResolvedOnly) && Objects.equals(transferGroupId, that.transferGroupId) && Objects.equals(supplierMerchantId, that.supplierMerchantId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, fromDate, toDate, onlyWithErrors, markResolvedOnly, transferGroupId, supplierMerchantId);
    }

    @Override
    public String toString() {
        return "ListSupplierTransfersArgs{" +
                "merchantId='" + merchantId + '\'' +
                ", fromDate='" + fromDate + '\'' +
                ", toDate='" + toDate + '\'' +
                ", onlyWithErrors='" + onlyWithErrors + '\'' +
                ", markResolvedOnly='" + markResolvedOnly + '\'' +
                ", transferGroupId='" + transferGroupId + '\'' +
                ", supplierMerchantId='" + supplierMerchantId + '\'' +

                '}';
    }
}