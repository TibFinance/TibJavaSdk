
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.Service;
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


public class SaveServiceArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
 * Retrieves or assigns the service associated with a merchant in the TIB Finance API. This property is crucial for managing service-related operations, including contract management and fee determination.
 */
    @JsonProperty("Service")
    private Service service;


    
    public SaveServiceArgs() {
    }

    
    public SaveServiceArgs(Service service) {
        this.service = service;

    }
    
    
    public SaveServiceArgs(String adminSessionToken, Service service) {
        super(adminSessionToken);
        this.service = service;

    }

    
    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaveServiceArgs that = (SaveServiceArgs) o;
        return Objects.equals(service, that.service) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(service);
    }

    @Override
    public String toString() {
        return "SaveServiceArgs{" +
                 "service='" + service + '\'' +

                '}';
    }
}