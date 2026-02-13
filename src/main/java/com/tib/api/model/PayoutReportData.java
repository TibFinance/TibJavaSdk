
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.Currency;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class PayoutReportData   {

    
    /**
 * 
 */
    @JsonProperty("TransferCount")
    private Integer transferCount;

    /**
 * 
 */
    @JsonProperty("ExternalId")
    private String externalId;

    /**
 * Retrieves or assigns the currency type used in transactions.
 */
    @JsonProperty("Currency")
    private Currency currency;

    /**
 * 
 */
    @JsonProperty("PayoutDate")
    private LocalDateTime payoutDate;

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
 * 
 */
    @JsonProperty("RefundsAmount")
    private Double refundsAmount;

    /**
 * 
 */
    @JsonProperty("NonProcessingDescriptions")
    private List<String> nonProcessingDescriptions;


    
    public PayoutReportData() {
    }

    
    public PayoutReportData(Integer transferCount, String externalId, Currency currency, LocalDateTime payoutDate, Double grossAmount, Double processingFeesAmount, Double convenientFeesAmount, Double nonProcessingFeesAmount, Double totalPaidAmount, Double refundsAmount, List<String> nonProcessingDescriptions) {
        this.transferCount = transferCount;
this.externalId = externalId;
this.currency = currency;
this.payoutDate = payoutDate;
this.grossAmount = grossAmount;
this.processingFeesAmount = processingFeesAmount;
this.convenientFeesAmount = convenientFeesAmount;
this.nonProcessingFeesAmount = nonProcessingFeesAmount;
this.totalPaidAmount = totalPaidAmount;
this.refundsAmount = refundsAmount;
this.nonProcessingDescriptions = nonProcessingDescriptions;

    }
    
    

    
    public Integer getTransferCount() {
        return transferCount;
    }

    public void setTransferCount(Integer transferCount) {
        this.transferCount = transferCount;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public LocalDateTime getPayoutDate() {
        return payoutDate;
    }

    public void setPayoutDate(LocalDateTime payoutDate) {
        this.payoutDate = payoutDate;
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

    public Double getRefundsAmount() {
        return refundsAmount;
    }

    public void setRefundsAmount(Double refundsAmount) {
        this.refundsAmount = refundsAmount;
    }

    public List<String> getNonProcessingDescriptions() {
        return nonProcessingDescriptions;
    }

    public void setNonProcessingDescriptions(List<String> nonProcessingDescriptions) {
        this.nonProcessingDescriptions = nonProcessingDescriptions;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PayoutReportData that = (PayoutReportData) o;
        return Objects.equals(transferCount, that.transferCount) && Objects.equals(externalId, that.externalId) && Objects.equals(currency, that.currency) && Objects.equals(payoutDate, that.payoutDate) && Objects.equals(grossAmount, that.grossAmount) && Objects.equals(processingFeesAmount, that.processingFeesAmount) && Objects.equals(convenientFeesAmount, that.convenientFeesAmount) && Objects.equals(nonProcessingFeesAmount, that.nonProcessingFeesAmount) && Objects.equals(totalPaidAmount, that.totalPaidAmount) && Objects.equals(refundsAmount, that.refundsAmount) && Objects.equals(nonProcessingDescriptions, that.nonProcessingDescriptions) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(transferCount, externalId, currency, payoutDate, grossAmount, processingFeesAmount, convenientFeesAmount, nonProcessingFeesAmount, totalPaidAmount, refundsAmount, nonProcessingDescriptions);
    }

    @Override
    public String toString() {
        return "PayoutReportData{" +
                 "transferCount='" + transferCount + '\'' +
 ", externalId='" + externalId + '\'' +
 ", currency='" + currency + '\'' +
 ", payoutDate='" + payoutDate + '\'' +
 ", grossAmount='" + grossAmount + '\'' +
 ", processingFeesAmount='" + processingFeesAmount + '\'' +
 ", convenientFeesAmount='" + convenientFeesAmount + '\'' +
 ", nonProcessingFeesAmount='" + nonProcessingFeesAmount + '\'' +
 ", totalPaidAmount='" + totalPaidAmount + '\'' +
 ", refundsAmount='" + refundsAmount + '\'' +
 ", nonProcessingDescriptions='" + nonProcessingDescriptions + '\'' +

                '}';
    }
}