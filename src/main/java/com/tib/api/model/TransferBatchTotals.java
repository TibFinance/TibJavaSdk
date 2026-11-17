
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class TransferBatchTotals   {

    
    /**
     * Number of items in the request.
     */
    @JsonProperty("ItemCount")
    private Integer itemCount;

    /**
     * Items whose payment was created; always 0 in the CreateTransferBatch reply.
     */
    @JsonProperty("CreatedCount")
    private Integer createdCount;

    /**
     * Items that matched an existing payment.
     */
    @JsonProperty("AlreadyCreatedCount")
    private Integer alreadyCreatedCount;

    /**
     * Items that were refused.
     */
    @JsonProperty("RefusedCount")
    private Integer refusedCount;

    /**
     * Items that were not processed: processing stopped before their payment was created, or the request stopped before them; always 0 in the CreateTransferBatch reply.
     */
    @JsonProperty("NotProcessedCount")
    private Integer notProcessedCount;

    /**
     * Items that passed every check and are not processed yet: in the reply, the items to be processed in the background; in GetTransferBatchResult, those still waiting.
     */
    @JsonProperty("AcceptedCount")
    private Integer acceptedCount;

    /**
     * Total amount of the collections the request created; always 0 in the CreateTransferBatch reply.
     */
    @JsonProperty("CreatedCollectionAmount")
    private Double createdCollectionAmount;

    /**
     * Total amount of the deposits the request created; always 0 in the CreateTransferBatch reply.
     */
    @JsonProperty("CreatedDepositAmount")
    private Double createdDepositAmount;


    
    public TransferBatchTotals() {
    }

    
    public TransferBatchTotals(Integer itemCount, Integer createdCount, Integer alreadyCreatedCount, Integer refusedCount, Integer notProcessedCount, Integer acceptedCount, Double createdCollectionAmount, Double createdDepositAmount) {
        this.itemCount = itemCount;
        this.createdCount = createdCount;
        this.alreadyCreatedCount = alreadyCreatedCount;
        this.refusedCount = refusedCount;
        this.notProcessedCount = notProcessedCount;
        this.acceptedCount = acceptedCount;
        this.createdCollectionAmount = createdCollectionAmount;
        this.createdDepositAmount = createdDepositAmount;
    }
    
    

    
    public Integer getItemCount() {
        return itemCount;
    }

    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    public Integer getCreatedCount() {
        return createdCount;
    }

    public void setCreatedCount(Integer createdCount) {
        this.createdCount = createdCount;
    }

    public Integer getAlreadyCreatedCount() {
        return alreadyCreatedCount;
    }

    public void setAlreadyCreatedCount(Integer alreadyCreatedCount) {
        this.alreadyCreatedCount = alreadyCreatedCount;
    }

    public Integer getRefusedCount() {
        return refusedCount;
    }

    public void setRefusedCount(Integer refusedCount) {
        this.refusedCount = refusedCount;
    }

    public Integer getNotProcessedCount() {
        return notProcessedCount;
    }

    public void setNotProcessedCount(Integer notProcessedCount) {
        this.notProcessedCount = notProcessedCount;
    }

    public Integer getAcceptedCount() {
        return acceptedCount;
    }

    public void setAcceptedCount(Integer acceptedCount) {
        this.acceptedCount = acceptedCount;
    }

    public Double getCreatedCollectionAmount() {
        return createdCollectionAmount;
    }

    public void setCreatedCollectionAmount(Double createdCollectionAmount) {
        this.createdCollectionAmount = createdCollectionAmount;
    }

    public Double getCreatedDepositAmount() {
        return createdDepositAmount;
    }

    public void setCreatedDepositAmount(Double createdDepositAmount) {
        this.createdDepositAmount = createdDepositAmount;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransferBatchTotals that = (TransferBatchTotals) o;
        return Objects.equals(itemCount, that.itemCount) && Objects.equals(createdCount, that.createdCount) && Objects.equals(alreadyCreatedCount, that.alreadyCreatedCount) && Objects.equals(refusedCount, that.refusedCount) && Objects.equals(notProcessedCount, that.notProcessedCount) && Objects.equals(acceptedCount, that.acceptedCount) && Objects.equals(createdCollectionAmount, that.createdCollectionAmount) && Objects.equals(createdDepositAmount, that.createdDepositAmount) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(itemCount, createdCount, alreadyCreatedCount, refusedCount, notProcessedCount, acceptedCount, createdCollectionAmount, createdDepositAmount);
    }

    @Override
    public String toString() {
        return "TransferBatchTotals{" +
                "itemCount='" + itemCount + '\'' +
                ", createdCount='" + createdCount + '\'' +
                ", alreadyCreatedCount='" + alreadyCreatedCount + '\'' +
                ", refusedCount='" + refusedCount + '\'' +
                ", notProcessedCount='" + notProcessedCount + '\'' +
                ", acceptedCount='" + acceptedCount + '\'' +
                ", createdCollectionAmount='" + createdCollectionAmount + '\'' +
                ", createdDepositAmount='" + createdDepositAmount + '\'' +

                '}';
    }
}