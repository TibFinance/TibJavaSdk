
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.FreeOperation;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class BatchFileEventToBroadcast   {

    
    /**
 * 
 */
    @JsonProperty("FreeOperation")
    private FreeOperation freeOperation;

    /**
 * 
 */
    @JsonProperty("File")
    private String file;

    /**
 * Retrieves or assigns the unique identifier for a payment.
 */
    @JsonProperty("PaymentId")
    private String paymentId;


    
    public BatchFileEventToBroadcast() {
    }

    
    public BatchFileEventToBroadcast(FreeOperation freeOperation, String file, String paymentId) {
        this.freeOperation = freeOperation;
this.file = file;
this.paymentId = paymentId;

    }
    
    

    
    public FreeOperation getFreeOperation() {
        return freeOperation;
    }

    public void setFreeOperation(FreeOperation freeOperation) {
        this.freeOperation = freeOperation;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BatchFileEventToBroadcast that = (BatchFileEventToBroadcast) o;
        return Objects.equals(freeOperation, that.freeOperation) && Objects.equals(file, that.file) && Objects.equals(paymentId, that.paymentId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(freeOperation, file, paymentId);
    }

    @Override
    public String toString() {
        return "BatchFileEventToBroadcast{" +
                 "freeOperation='" + freeOperation + '\'' +
 ", file='" + file + '\'' +
 ", paymentId='" + paymentId + '\'' +

                '}';
    }
}