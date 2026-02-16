
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.PayoutData;
import com.tib.api.model.TransferBaseInformationEntity;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class USOperationReportEntity   {

    
    /**
     * 
     */
    @JsonProperty("Payout")
    private PayoutData payout;

    /**
     * 
     */
    @JsonProperty("Transfers")
    private List<TransferBaseInformationEntity> transfers;


    
    public USOperationReportEntity() {
    }

    
    public USOperationReportEntity(PayoutData payout, List<TransferBaseInformationEntity> transfers) {
        this.payout = payout;
        this.transfers = transfers;
    }
    
    

    
    public PayoutData getPayout() {
        return payout;
    }

    public void setPayout(PayoutData payout) {
        this.payout = payout;
    }

    public List<TransferBaseInformationEntity> getTransfers() {
        return transfers;
    }

    public void setTransfers(List<TransferBaseInformationEntity> transfers) {
        this.transfers = transfers;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        USOperationReportEntity that = (USOperationReportEntity) o;
        return Objects.equals(payout, that.payout) && Objects.equals(transfers, that.transfers) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(payout, transfers);
    }

    @Override
    public String toString() {
        return "USOperationReportEntity{" +
                "payout='" + payout + '\'' +
                ", transfers='" + transfers + '\'' +

                '}';
    }
}