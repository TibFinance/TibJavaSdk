
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.request.BaseAuthenticatedCryptedArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class DeleteCustomerArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
 * Serves as a unique identifier for each customer within the system.
 */
    @JsonProperty("CustomerId")
    private String customerId;


    
    public DeleteCustomerArgs() {
    }

    
    public DeleteCustomerArgs(String customerId) {
        this.customerId = customerId;

    }
    
    
    public DeleteCustomerArgs(String sessionToken, String customerId) {
        super(sessionToken);
        this.customerId = customerId;

    }

    
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeleteCustomerArgs that = (DeleteCustomerArgs) o;
        return Objects.equals(customerId, that.customerId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(customerId);
    }

    @Override
    public String toString() {
        return "DeleteCustomerArgs{" +
                 "customerId='" + customerId + '\'' +

                '}';
    }
}