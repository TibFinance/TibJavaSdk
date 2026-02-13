
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.PaymentOperationEntity;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class Payment  extends PaymentBaseWithHierarchy  {

    
    /**
 * Gets or sets the collection of payment operations associated with the current entity.
 */
    @JsonProperty("Operations")
    private List<PaymentOperationEntity> operations;


    
    public Payment() {
    }

    
    public Payment(List<PaymentOperationEntity> operations) {
        this.operations = operations;

    }
    
    
    public Payment(String serviceId, String serviceName, String merchantId, String merchantExternalSystemId, String merchantExternalSystemGroupId, String merchantName, boolean isOverlodedMerchant, List<PaymentOperationEntity> operations) {
        super(serviceId, serviceName, merchantId, merchantExternalSystemId, merchantExternalSystemGroupId, merchantName, isOverlodedMerchant);
        this.operations = operations;

    }

    
    public List<PaymentOperationEntity> getOperations() {
        return operations;
    }

    public void setOperations(List<PaymentOperationEntity> operations) {
        this.operations = operations;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment that = (Payment) o;
        return Objects.equals(operations, that.operations) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(operations);
    }

    @Override
    public String toString() {
        return "Payment{" +
                 "operations='" + operations + '\'' +

                '}';
    }
}