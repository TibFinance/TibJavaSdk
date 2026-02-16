
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


public class BaseEventPayload   {

    
    /**
     * 
     */
    @JsonProperty("EventName")
    private String eventName;


    
    public BaseEventPayload() {
    }

    
    public BaseEventPayload(String eventName) {
        this.eventName = eventName;
    }
    
    

    
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseEventPayload that = (BaseEventPayload) o;
        return Objects.equals(eventName, that.eventName) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(eventName);
    }

    @Override
    public String toString() {
        return "BaseEventPayload{" +
                "eventName='" + eventName + '\'' +

                '}';
    }
}