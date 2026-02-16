
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


public class ChangeTransactionStatusBulkArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
     * 
     */
    @JsonProperty("TransactionIds")
    private List<String> transactionIds;

    /**
     * 
     */
    @JsonProperty("TransactionStatus")
    private Integer transactionStatus;


    
    public ChangeTransactionStatusBulkArgs() {
    }

    
    public ChangeTransactionStatusBulkArgs(List<String> transactionIds, Integer transactionStatus) {
        this.transactionIds = transactionIds;
        this.transactionStatus = transactionStatus;
    }
    
    
    public ChangeTransactionStatusBulkArgs(String adminSessionToken, List<String> transactionIds, Integer transactionStatus) {
        super(adminSessionToken);
        this.transactionIds = transactionIds;
        this.transactionStatus = transactionStatus;
    }

    
    public List<String> getTransactionIds() {
        return transactionIds;
    }

    public void setTransactionIds(List<String> transactionIds) {
        this.transactionIds = transactionIds;
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
        ChangeTransactionStatusBulkArgs that = (ChangeTransactionStatusBulkArgs) o;
        return Objects.equals(transactionIds, that.transactionIds) && Objects.equals(transactionStatus, that.transactionStatus) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(transactionIds, transactionStatus);
    }

    @Override
    public String toString() {
        return "ChangeTransactionStatusBulkArgs{" +
                "transactionIds='" + transactionIds + '\'' +
                ", transactionStatus='" + transactionStatus + '\'' +

                '}';
    }
}