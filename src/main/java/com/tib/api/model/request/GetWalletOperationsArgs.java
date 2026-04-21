
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


public class GetWalletOperationsArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * Identifier of the service for which recurring transfers are requested
     */
    @JsonProperty("ServiceId")
    private String serviceId;

    /**
     * Start date of the wallet operations date range filter.
     */
    @JsonProperty("From")
    private OffsetDateTime from;

    /**
     * End date of the wallet operations date range filter.
     */
    @JsonProperty("To")
    private OffsetDateTime to;


    
    public GetWalletOperationsArgs() {
    }

    
    public GetWalletOperationsArgs(String serviceId, OffsetDateTime from, OffsetDateTime to) {
        this.serviceId = serviceId;
        this.from = from;
        this.to = to;
    }
    
    
    public GetWalletOperationsArgs(String sessionToken, String serviceId, OffsetDateTime from, OffsetDateTime to) {
        super(sessionToken);
        this.serviceId = serviceId;
        this.from = from;
        this.to = to;
    }

    
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public OffsetDateTime getFrom() {
        return from;
    }

    public void setFrom(OffsetDateTime from) {
        this.from = from;
    }

    public OffsetDateTime getTo() {
        return to;
    }

    public void setTo(OffsetDateTime to) {
        this.to = to;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetWalletOperationsArgs that = (GetWalletOperationsArgs) o;
        return Objects.equals(serviceId, that.serviceId) && Objects.equals(from, that.from) && Objects.equals(to, that.to) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(serviceId, from, to);
    }

    @Override
    public String toString() {
        return "GetWalletOperationsArgs{" +
                "serviceId='" + serviceId + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +

                '}';
    }
}