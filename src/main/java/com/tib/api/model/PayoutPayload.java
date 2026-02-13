
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.TransferPayload;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class PayoutPayload   {

    
    /**
 * 
 */
    @JsonProperty("PayoutId")
    private String payoutId;

    /**
 * 
 */
    @JsonProperty("ExternalId")
    private String externalId;

    /**
 * Retrieves or assigns the currency type used in transactions.
 */
    @JsonProperty("Currency")
    private String currency;

    /**
 * 
 */
    @JsonProperty("PayoutDate")
    private String payoutDate;

    /**
 * 
 */
    @JsonProperty("TransferCount")
    private Integer transferCount;

    /**
 * 
 */
    @JsonProperty("GrossAmount")
    private Double grossAmount;

    /**
 * 
 */
    @JsonProperty("ProcessingFeesAmount")
    private Double processingFeesAmount;

    /**
 * 
 */
    @JsonProperty("ConvenientFeesAmount")
    private Double convenientFeesAmount;

    /**
 * 
 */
    @JsonProperty("NonProcessingFeesAmount")
    private Double nonProcessingFeesAmount;

    /**
 * 
 */
    @JsonProperty("TotalPaidAmount")
    private Double totalPaidAmount;

    /**
 * The date and time when the payment was created.
 */
    @JsonProperty("CreatedDate")
    private String createdDate;

    /**
 * 
 */
    @JsonProperty("Transferts")
    private List<TransferPayload> transferts;


    
    public PayoutPayload() {
    }

    
    public PayoutPayload(String payoutId, String externalId, String currency, String payoutDate, Integer transferCount, Double grossAmount, Double processingFeesAmount, Double convenientFeesAmount, Double nonProcessingFeesAmount, Double totalPaidAmount, String createdDate, List<TransferPayload> transferts) {
        this.payoutId = payoutId;
this.externalId = externalId;
this.currency = currency;
this.payoutDate = payoutDate;
this.transferCount = transferCount;
this.grossAmount = grossAmount;
this.processingFeesAmount = processingFeesAmount;
this.convenientFeesAmount = convenientFeesAmount;
this.nonProcessingFeesAmount = nonProcessingFeesAmount;
this.totalPaidAmount = totalPaidAmount;
this.createdDate = createdDate;
this.transferts = transferts;

    }
    
    

    
    public String getPayoutId() {
        return payoutId;
    }

    public void setPayoutId(String payoutId) {
        this.payoutId = payoutId;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPayoutDate() {
        return payoutDate;
    }

    public void setPayoutDate(String payoutDate) {
        this.payoutDate = payoutDate;
    }

    public Integer getTransferCount() {
        return transferCount;
    }

    public void setTransferCount(Integer transferCount) {
        this.transferCount = transferCount;
    }

    public Double getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(Double grossAmount) {
        this.grossAmount = grossAmount;
    }

    public Double getProcessingFeesAmount() {
        return processingFeesAmount;
    }

    public void setProcessingFeesAmount(Double processingFeesAmount) {
        this.processingFeesAmount = processingFeesAmount;
    }

    public Double getConvenientFeesAmount() {
        return convenientFeesAmount;
    }

    public void setConvenientFeesAmount(Double convenientFeesAmount) {
        this.convenientFeesAmount = convenientFeesAmount;
    }

    public Double getNonProcessingFeesAmount() {
        return nonProcessingFeesAmount;
    }

    public void setNonProcessingFeesAmount(Double nonProcessingFeesAmount) {
        this.nonProcessingFeesAmount = nonProcessingFeesAmount;
    }

    public Double getTotalPaidAmount() {
        return totalPaidAmount;
    }

    public void setTotalPaidAmount(Double totalPaidAmount) {
        this.totalPaidAmount = totalPaidAmount;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public List<TransferPayload> getTransferts() {
        return transferts;
    }

    public void setTransferts(List<TransferPayload> transferts) {
        this.transferts = transferts;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PayoutPayload that = (PayoutPayload) o;
        return Objects.equals(payoutId, that.payoutId) && Objects.equals(externalId, that.externalId) && Objects.equals(currency, that.currency) && Objects.equals(payoutDate, that.payoutDate) && Objects.equals(transferCount, that.transferCount) && Objects.equals(grossAmount, that.grossAmount) && Objects.equals(processingFeesAmount, that.processingFeesAmount) && Objects.equals(convenientFeesAmount, that.convenientFeesAmount) && Objects.equals(nonProcessingFeesAmount, that.nonProcessingFeesAmount) && Objects.equals(totalPaidAmount, that.totalPaidAmount) && Objects.equals(createdDate, that.createdDate) && Objects.equals(transferts, that.transferts) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(payoutId, externalId, currency, payoutDate, transferCount, grossAmount, processingFeesAmount, convenientFeesAmount, nonProcessingFeesAmount, totalPaidAmount, createdDate, transferts);
    }

    @Override
    public String toString() {
        return "PayoutPayload{" +
                 "payoutId='" + payoutId + '\'' +
 ", externalId='" + externalId + '\'' +
 ", currency='" + currency + '\'' +
 ", payoutDate='" + payoutDate + '\'' +
 ", transferCount='" + transferCount + '\'' +
 ", grossAmount='" + grossAmount + '\'' +
 ", processingFeesAmount='" + processingFeesAmount + '\'' +
 ", convenientFeesAmount='" + convenientFeesAmount + '\'' +
 ", nonProcessingFeesAmount='" + nonProcessingFeesAmount + '\'' +
 ", totalPaidAmount='" + totalPaidAmount + '\'' +
 ", createdDate='" + createdDate + '\'' +
 ", transferts='" + transferts + '\'' +

                '}';
    }
}