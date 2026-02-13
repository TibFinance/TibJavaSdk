
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class GetCustomerServiceCurrencyArgs  implements IBaseCryptedServiceArgs  {

    
    /**
 * Generates a unique identifier for a specific service to facilitate the creation of a customer list.
 */
    @JsonProperty("ServiceId")
    private String serviceId;


    
    public GetCustomerServiceCurrencyArgs() {
    }

    
    public GetCustomerServiceCurrencyArgs(String serviceId) {
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
        GetCustomerServiceCurrencyArgs that = (GetCustomerServiceCurrencyArgs) o;
        return Objects.equals(serviceId, that.serviceId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(serviceId);
    }

    @Override
    public String toString() {
        return "GetCustomerServiceCurrencyArgs{" +
                 "serviceId='" + serviceId + '\'' +

                '}';
    }
}