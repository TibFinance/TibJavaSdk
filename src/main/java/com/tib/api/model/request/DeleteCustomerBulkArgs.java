
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


public class DeleteCustomerBulkArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
 * 
 */
    @JsonProperty("CustomerIds")
    private List<String> customerIds;


    
    public DeleteCustomerBulkArgs() {
    }

    
    public DeleteCustomerBulkArgs(List<String> customerIds) {
        this.customerIds = customerIds;

    }
    
    
    public DeleteCustomerBulkArgs(String adminSessionToken, List<String> customerIds) {
        super(adminSessionToken);
        this.customerIds = customerIds;

    }

    
    public List<String> getCustomerIds() {
        return customerIds;
    }

    public void setCustomerIds(List<String> customerIds) {
        this.customerIds = customerIds;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeleteCustomerBulkArgs that = (DeleteCustomerBulkArgs) o;
        return Objects.equals(customerIds, that.customerIds) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(customerIds);
    }

    @Override
    public String toString() {
        return "DeleteCustomerBulkArgs{" +
                 "customerIds='" + customerIds + '\'' +

                '}';
    }
}