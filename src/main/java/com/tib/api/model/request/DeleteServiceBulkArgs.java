
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


public class DeleteServiceBulkArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
     * 
     */
    @JsonProperty("ServiceIds")
    private List<String> serviceIds;


    
    public DeleteServiceBulkArgs() {
    }

    
    public DeleteServiceBulkArgs(List<String> serviceIds) {
        this.serviceIds = serviceIds;
    }
    
    
    public DeleteServiceBulkArgs(String adminSessionToken, List<String> serviceIds) {
        super(adminSessionToken);
        this.serviceIds = serviceIds;
    }

    
    public List<String> getServiceIds() {
        return serviceIds;
    }

    public void setServiceIds(List<String> serviceIds) {
        this.serviceIds = serviceIds;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeleteServiceBulkArgs that = (DeleteServiceBulkArgs) o;
        return Objects.equals(serviceIds, that.serviceIds) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(serviceIds);
    }

    @Override
    public String toString() {
        return "DeleteServiceBulkArgs{" +
                "serviceIds='" + serviceIds + '\'' +

                '}';
    }
}