
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.request.BaseAuthenticatedCryptedArgs;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class ListSupplierRecurringTransfersByServiceArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * Identifier of the service for which recurring transfers are requested
     */
    @JsonProperty("ServiceId")
    private String serviceId;


    
    public ListSupplierRecurringTransfersByServiceArgs() {
    }

    
    public ListSupplierRecurringTransfersByServiceArgs(String serviceId) {
        this.serviceId = serviceId;
    }
    
    
    public ListSupplierRecurringTransfersByServiceArgs(String sessionToken, String serviceId) {
        super(sessionToken);
        this.serviceId = serviceId;
    }

    
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListSupplierRecurringTransfersByServiceArgs that = (ListSupplierRecurringTransfersByServiceArgs) o;
        return Objects.equals(serviceId, that.serviceId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(serviceId);
    }

    @Override
    public String toString() {
        return "ListSupplierRecurringTransfersByServiceArgs{" +
                "serviceId='" + serviceId + '\'' +

                '}';
    }
}