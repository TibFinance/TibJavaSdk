
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.AcpTransactionType;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class ValidationsLimitsRules   {

    
    /**
     * Gets or sets the limit.
     */
    @JsonProperty("Limit")
    private Double limit;

    /**
     * Gets or sets the limit daily.
     */
    @JsonProperty("LimitDaily")
    private Double limitDaily;

    /**
     * Gets or sets the limit per bank account daily.
     */
    @JsonProperty("LimitPerBankAccountDaily")
    private Double limitPerBankAccountDaily;

    /**
     * Gets or sets the limit per bank account per delays.
     */
    @JsonProperty("LimitPerBankAccountPerDelays")
    private Double limitPerBankAccountPerDelays;

    /**
     * Gets or sets the delays.
     */
    @JsonProperty("Delays")
    private Integer delays;

    /**
     * Gets or sets the client warning limit.
     */
    @JsonProperty("ClientWarningLimit")
    private Double clientWarningLimit;

    /**
     * Gets or sets the tib warning limit.
     */
    @JsonProperty("TIBWarningLimit")
    private Double tIBWarningLimit;

    /**
     * Gets or sets the number per bank account daily.
     */
    @JsonProperty("NumberPerBankAccountDaily")
    private Integer numberPerBankAccountDaily;

    /**
     * Gets or sets the number per bank per delays.
     */
    @JsonProperty("NumberPerBankPerDelays")
    private Integer numberPerBankPerDelays;

    /**
     * Gets or sets the tib warning limit per bank account daily.
     */
    @JsonProperty("TIBWarningLimitPerBankAccountDaily")
    private Double tIBWarningLimitPerBankAccountDaily;

    /**
     * Gets or sets the tib warning limit per bank account per delays.
     */
    @JsonProperty("TIBWarningLimitPerBankAccountPerDelays")
    private Double tIBWarningLimitPerBankAccountPerDelays;

    /**
     * Gets or sets the tib warning number per bank account daily.
     */
    @JsonProperty("TIBWarningNumberPerBankAccountDaily")
    private Integer tIBWarningNumberPerBankAccountDaily;

    /**
     * Gets or sets the tib warning number per bank per delays.
     */
    @JsonProperty("TIBWarningNumberPerBankPerDelays")
    private Integer tIBWarningNumberPerBankPerDelays;

    /**
     * Gets or sets the tib warning limit daily.
     */
    @JsonProperty("TIBWarningLimitDaily")
    private Double tIBWarningLimitDaily;

    /**
     * Specifies the operation category used throughout the API.
     */
    @JsonProperty("OperationType")
    private AcpTransactionType operationType;

    /**
     * Gets or sets the client Daily limit
     */
    @JsonProperty("ClientLimitDaily")
    private Double clientLimitDaily;

    /**
     * Gets or sets the tib warning client Daily limit
     */
    @JsonProperty("TIBWarningClientLimitDaily")
    private Double tIBWarningClientLimitDaily;


    
    public ValidationsLimitsRules() {
    }

    
    public ValidationsLimitsRules(Double limit, Double limitDaily, Double limitPerBankAccountDaily, Double limitPerBankAccountPerDelays, Integer delays, Double clientWarningLimit, Double tIBWarningLimit, Integer numberPerBankAccountDaily, Integer numberPerBankPerDelays, Double tIBWarningLimitPerBankAccountDaily, Double tIBWarningLimitPerBankAccountPerDelays, Integer tIBWarningNumberPerBankAccountDaily, Integer tIBWarningNumberPerBankPerDelays, Double tIBWarningLimitDaily, AcpTransactionType operationType, Double clientLimitDaily, Double tIBWarningClientLimitDaily) {
        this.limit = limit;
        this.limitDaily = limitDaily;
        this.limitPerBankAccountDaily = limitPerBankAccountDaily;
        this.limitPerBankAccountPerDelays = limitPerBankAccountPerDelays;
        this.delays = delays;
        this.clientWarningLimit = clientWarningLimit;
        this.tIBWarningLimit = tIBWarningLimit;
        this.numberPerBankAccountDaily = numberPerBankAccountDaily;
        this.numberPerBankPerDelays = numberPerBankPerDelays;
        this.tIBWarningLimitPerBankAccountDaily = tIBWarningLimitPerBankAccountDaily;
        this.tIBWarningLimitPerBankAccountPerDelays = tIBWarningLimitPerBankAccountPerDelays;
        this.tIBWarningNumberPerBankAccountDaily = tIBWarningNumberPerBankAccountDaily;
        this.tIBWarningNumberPerBankPerDelays = tIBWarningNumberPerBankPerDelays;
        this.tIBWarningLimitDaily = tIBWarningLimitDaily;
        this.operationType = operationType;
        this.clientLimitDaily = clientLimitDaily;
        this.tIBWarningClientLimitDaily = tIBWarningClientLimitDaily;
    }
    
    

    
    public Double getLimit() {
        return limit;
    }

    public void setLimit(Double limit) {
        this.limit = limit;
    }

    public Double getLimitDaily() {
        return limitDaily;
    }

    public void setLimitDaily(Double limitDaily) {
        this.limitDaily = limitDaily;
    }

    public Double getLimitPerBankAccountDaily() {
        return limitPerBankAccountDaily;
    }

    public void setLimitPerBankAccountDaily(Double limitPerBankAccountDaily) {
        this.limitPerBankAccountDaily = limitPerBankAccountDaily;
    }

    public Double getLimitPerBankAccountPerDelays() {
        return limitPerBankAccountPerDelays;
    }

    public void setLimitPerBankAccountPerDelays(Double limitPerBankAccountPerDelays) {
        this.limitPerBankAccountPerDelays = limitPerBankAccountPerDelays;
    }

    public Integer getDelays() {
        return delays;
    }

    public void setDelays(Integer delays) {
        this.delays = delays;
    }

    public Double getClientWarningLimit() {
        return clientWarningLimit;
    }

    public void setClientWarningLimit(Double clientWarningLimit) {
        this.clientWarningLimit = clientWarningLimit;
    }

    public Double getTIBWarningLimit() {
        return tIBWarningLimit;
    }

    public void setTIBWarningLimit(Double tIBWarningLimit) {
        this.tIBWarningLimit = tIBWarningLimit;
    }

    public Integer getNumberPerBankAccountDaily() {
        return numberPerBankAccountDaily;
    }

    public void setNumberPerBankAccountDaily(Integer numberPerBankAccountDaily) {
        this.numberPerBankAccountDaily = numberPerBankAccountDaily;
    }

    public Integer getNumberPerBankPerDelays() {
        return numberPerBankPerDelays;
    }

    public void setNumberPerBankPerDelays(Integer numberPerBankPerDelays) {
        this.numberPerBankPerDelays = numberPerBankPerDelays;
    }

    public Double getTIBWarningLimitPerBankAccountDaily() {
        return tIBWarningLimitPerBankAccountDaily;
    }

    public void setTIBWarningLimitPerBankAccountDaily(Double tIBWarningLimitPerBankAccountDaily) {
        this.tIBWarningLimitPerBankAccountDaily = tIBWarningLimitPerBankAccountDaily;
    }

    public Double getTIBWarningLimitPerBankAccountPerDelays() {
        return tIBWarningLimitPerBankAccountPerDelays;
    }

    public void setTIBWarningLimitPerBankAccountPerDelays(Double tIBWarningLimitPerBankAccountPerDelays) {
        this.tIBWarningLimitPerBankAccountPerDelays = tIBWarningLimitPerBankAccountPerDelays;
    }

    public Integer getTIBWarningNumberPerBankAccountDaily() {
        return tIBWarningNumberPerBankAccountDaily;
    }

    public void setTIBWarningNumberPerBankAccountDaily(Integer tIBWarningNumberPerBankAccountDaily) {
        this.tIBWarningNumberPerBankAccountDaily = tIBWarningNumberPerBankAccountDaily;
    }

    public Integer getTIBWarningNumberPerBankPerDelays() {
        return tIBWarningNumberPerBankPerDelays;
    }

    public void setTIBWarningNumberPerBankPerDelays(Integer tIBWarningNumberPerBankPerDelays) {
        this.tIBWarningNumberPerBankPerDelays = tIBWarningNumberPerBankPerDelays;
    }

    public Double getTIBWarningLimitDaily() {
        return tIBWarningLimitDaily;
    }

    public void setTIBWarningLimitDaily(Double tIBWarningLimitDaily) {
        this.tIBWarningLimitDaily = tIBWarningLimitDaily;
    }

    public AcpTransactionType getOperationType() {
        return operationType;
    }

    public void setOperationType(AcpTransactionType operationType) {
        this.operationType = operationType;
    }

    public Double getClientLimitDaily() {
        return clientLimitDaily;
    }

    public void setClientLimitDaily(Double clientLimitDaily) {
        this.clientLimitDaily = clientLimitDaily;
    }

    public Double getTIBWarningClientLimitDaily() {
        return tIBWarningClientLimitDaily;
    }

    public void setTIBWarningClientLimitDaily(Double tIBWarningClientLimitDaily) {
        this.tIBWarningClientLimitDaily = tIBWarningClientLimitDaily;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValidationsLimitsRules that = (ValidationsLimitsRules) o;
        return Objects.equals(limit, that.limit) && Objects.equals(limitDaily, that.limitDaily) && Objects.equals(limitPerBankAccountDaily, that.limitPerBankAccountDaily) && Objects.equals(limitPerBankAccountPerDelays, that.limitPerBankAccountPerDelays) && Objects.equals(delays, that.delays) && Objects.equals(clientWarningLimit, that.clientWarningLimit) && Objects.equals(tIBWarningLimit, that.tIBWarningLimit) && Objects.equals(numberPerBankAccountDaily, that.numberPerBankAccountDaily) && Objects.equals(numberPerBankPerDelays, that.numberPerBankPerDelays) && Objects.equals(tIBWarningLimitPerBankAccountDaily, that.tIBWarningLimitPerBankAccountDaily) && Objects.equals(tIBWarningLimitPerBankAccountPerDelays, that.tIBWarningLimitPerBankAccountPerDelays) && Objects.equals(tIBWarningNumberPerBankAccountDaily, that.tIBWarningNumberPerBankAccountDaily) && Objects.equals(tIBWarningNumberPerBankPerDelays, that.tIBWarningNumberPerBankPerDelays) && Objects.equals(tIBWarningLimitDaily, that.tIBWarningLimitDaily) && Objects.equals(operationType, that.operationType) && Objects.equals(clientLimitDaily, that.clientLimitDaily) && Objects.equals(tIBWarningClientLimitDaily, that.tIBWarningClientLimitDaily) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(limit, limitDaily, limitPerBankAccountDaily, limitPerBankAccountPerDelays, delays, clientWarningLimit, tIBWarningLimit, numberPerBankAccountDaily, numberPerBankPerDelays, tIBWarningLimitPerBankAccountDaily, tIBWarningLimitPerBankAccountPerDelays, tIBWarningNumberPerBankAccountDaily, tIBWarningNumberPerBankPerDelays, tIBWarningLimitDaily, operationType, clientLimitDaily, tIBWarningClientLimitDaily);
    }

    @Override
    public String toString() {
        return "ValidationsLimitsRules{" +
                "limit='" + limit + '\'' +
                ", limitDaily='" + limitDaily + '\'' +
                ", limitPerBankAccountDaily='" + limitPerBankAccountDaily + '\'' +
                ", limitPerBankAccountPerDelays='" + limitPerBankAccountPerDelays + '\'' +
                ", delays='" + delays + '\'' +
                ", clientWarningLimit='" + clientWarningLimit + '\'' +
                ", tIBWarningLimit='" + tIBWarningLimit + '\'' +
                ", numberPerBankAccountDaily='" + numberPerBankAccountDaily + '\'' +
                ", numberPerBankPerDelays='" + numberPerBankPerDelays + '\'' +
                ", tIBWarningLimitPerBankAccountDaily='" + tIBWarningLimitPerBankAccountDaily + '\'' +
                ", tIBWarningLimitPerBankAccountPerDelays='" + tIBWarningLimitPerBankAccountPerDelays + '\'' +
                ", tIBWarningNumberPerBankAccountDaily='" + tIBWarningNumberPerBankAccountDaily + '\'' +
                ", tIBWarningNumberPerBankPerDelays='" + tIBWarningNumberPerBankPerDelays + '\'' +
                ", tIBWarningLimitDaily='" + tIBWarningLimitDaily + '\'' +
                ", operationType='" + operationType + '\'' +
                ", clientLimitDaily='" + clientLimitDaily + '\'' +
                ", tIBWarningClientLimitDaily='" + tIBWarningClientLimitDaily + '\'' +

                '}';
    }
}