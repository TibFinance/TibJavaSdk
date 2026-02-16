
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.request.BaseAdminOnlyCryptedArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class ChangeTransactionStatusArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
     * 
     */
    @JsonProperty("TransactionId")
    private String transactionId;

    /**
     * 
     */
    @JsonProperty("TransactionStatus")
    private Integer transactionStatus;


    
    public ChangeTransactionStatusArgs() {
    }

    
    public ChangeTransactionStatusArgs(String transactionId, Integer transactionStatus) {
        this.transactionId = transactionId;
        this.transactionStatus = transactionStatus;
    }
    
    
    public ChangeTransactionStatusArgs(String adminSessionToken, String transactionId, Integer transactionStatus) {
        super(adminSessionToken);
        this.transactionId = transactionId;
        this.transactionStatus = transactionStatus;
    }

    
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Integer getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(Integer transactionStatus) {
        this.transactionStatus = transactionStatus;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChangeTransactionStatusArgs that = (ChangeTransactionStatusArgs) o;
        return Objects.equals(transactionId, that.transactionId) && Objects.equals(transactionStatus, that.transactionStatus) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(transactionId, transactionStatus);
    }

    @Override
    public String toString() {
        return "ChangeTransactionStatusArgs{" +
                "transactionId='" + transactionId + '\'' +
                ", transactionStatus='" + transactionStatus + '\'' +

                '}';
    }
}