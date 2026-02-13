
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


public class CollectMerchantArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
 * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
 */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
 * Retrieves or assigns the monetary amount involved in the transaction.
 */
    @JsonProperty("Amount")
    private Double amount;

    /**
 * Specifies the category of a financial operation.
 */
    @JsonProperty("OperationKind")
    private Integer operationKind;


    
    public CollectMerchantArgs() {
    }

    
    public CollectMerchantArgs(String merchantId, Double amount, Integer operationKind) {
        this.merchantId = merchantId;
this.amount = amount;
this.operationKind = operationKind;

    }
    
    
    public CollectMerchantArgs(String adminSessionToken, String merchantId, Double amount, Integer operationKind) {
        super(adminSessionToken);
        this.merchantId = merchantId;
this.amount = amount;
this.operationKind = operationKind;

    }

    
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getOperationKind() {
        return operationKind;
    }

    public void setOperationKind(Integer operationKind) {
        this.operationKind = operationKind;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CollectMerchantArgs that = (CollectMerchantArgs) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(amount, that.amount) && Objects.equals(operationKind, that.operationKind) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, amount, operationKind);
    }

    @Override
    public String toString() {
        return "CollectMerchantArgs{" +
                 "merchantId='" + merchantId + '\'' +
 ", amount='" + amount + '\'' +
 ", operationKind='" + operationKind + '\'' +

                '}';
    }
}