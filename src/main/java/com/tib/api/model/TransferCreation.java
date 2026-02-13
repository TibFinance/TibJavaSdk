
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.TransferType;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class TransferCreation   {

    
    /**
 * The date and time when the payment was created.
 */
    @JsonProperty("CreatedDate")
    private LocalDateTime createdDate;

    /**
 * Represents the unique identifier for a group within the TIB Finance API.
 */
    @JsonProperty("GroupId")
    private String groupId;

    /**
 * Gets or sets the number of transfers.
 */
    @JsonProperty("NumberOfTransfers")
    private Integer numberOfTransfers;

    /**
 * Defines and manages the type of transfer operation within the system.
 */
    @JsonProperty("TransferType")
    private TransferType transferType;


    
    public TransferCreation() {
    }

    
    public TransferCreation(LocalDateTime createdDate, String groupId, Integer numberOfTransfers, TransferType transferType) {
        this.createdDate = createdDate;
this.groupId = groupId;
this.numberOfTransfers = numberOfTransfers;
this.transferType = transferType;

    }
    
    

    
    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Integer getNumberOfTransfers() {
        return numberOfTransfers;
    }

    public void setNumberOfTransfers(Integer numberOfTransfers) {
        this.numberOfTransfers = numberOfTransfers;
    }

    public TransferType getTransferType() {
        return transferType;
    }

    public void setTransferType(TransferType transferType) {
        this.transferType = transferType;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransferCreation that = (TransferCreation) o;
        return Objects.equals(createdDate, that.createdDate) && Objects.equals(groupId, that.groupId) && Objects.equals(numberOfTransfers, that.numberOfTransfers) && Objects.equals(transferType, that.transferType) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(createdDate, groupId, numberOfTransfers, transferType);
    }

    @Override
    public String toString() {
        return "TransferCreation{" +
                 "createdDate='" + createdDate + '\'' +
 ", groupId='" + groupId + '\'' +
 ", numberOfTransfers='" + numberOfTransfers + '\'' +
 ", transferType='" + transferType + '\'' +

                '}';
    }
}