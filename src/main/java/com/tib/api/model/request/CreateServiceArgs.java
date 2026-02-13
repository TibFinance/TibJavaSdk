
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.ServiceEntity;
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


public class CreateServiceArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
 * Gets or sets the service information.
 */
    @JsonProperty("ServiceInfo")
    private ServiceEntity serviceInfo;

    /**
 * Gets or sets a value indicating whether [create innactive].
 */
    @JsonProperty("CreateInnactive")
    private boolean createInnactive;


    
    public CreateServiceArgs() {
    }

    
    public CreateServiceArgs(ServiceEntity serviceInfo, boolean createInnactive) {
        this.serviceInfo = serviceInfo;
this.createInnactive = createInnactive;

    }
    
    
    public CreateServiceArgs(String sessionToken, ServiceEntity serviceInfo, boolean createInnactive) {
        super(sessionToken);
        this.serviceInfo = serviceInfo;
this.createInnactive = createInnactive;

    }

    
    public ServiceEntity getServiceInfo() {
        return serviceInfo;
    }

    public void setServiceInfo(ServiceEntity serviceInfo) {
        this.serviceInfo = serviceInfo;
    }

    public boolean getCreateInnactive() {
        return createInnactive;
    }

    public void setCreateInnactive(boolean createInnactive) {
        this.createInnactive = createInnactive;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateServiceArgs that = (CreateServiceArgs) o;
        return Objects.equals(serviceInfo, that.serviceInfo) && Objects.equals(createInnactive, that.createInnactive) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(serviceInfo, createInnactive);
    }

    @Override
    public String toString() {
        return "CreateServiceArgs{" +
                 "serviceInfo='" + serviceInfo + '\'' +
 ", createInnactive='" + createInnactive + '\'' +

                '}';
    }
}