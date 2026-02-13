
package com.tib.api.model;

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


public class ClientWithRequestCount  extends ClientBoarding  {

    
    /**
 * 
 */
    @JsonProperty("WaitingRequestsCount")
    private Integer waitingRequestsCount;


    
    public ClientWithRequestCount() {
    }

    
    public ClientWithRequestCount(Integer waitingRequestsCount) {
        this.waitingRequestsCount = waitingRequestsCount;

    }
    
    
    public ClientWithRequestCount(String clientId, String clientName, String clientEmail, String clientPhone, Integer waitingRequestsCount) {
        super(clientId, clientName, clientEmail, clientPhone);
        this.waitingRequestsCount = waitingRequestsCount;

    }

    
    public Integer getWaitingRequestsCount() {
        return waitingRequestsCount;
    }

    public void setWaitingRequestsCount(Integer waitingRequestsCount) {
        this.waitingRequestsCount = waitingRequestsCount;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientWithRequestCount that = (ClientWithRequestCount) o;
        return Objects.equals(waitingRequestsCount, that.waitingRequestsCount) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(waitingRequestsCount);
    }

    @Override
    public String toString() {
        return "ClientWithRequestCount{" +
                 "waitingRequestsCount='" + waitingRequestsCount + '\'' +

                '}';
    }
}