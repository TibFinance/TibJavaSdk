
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.Interac;
import com.tib.api.model.request.BaseProcessDropInArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class ProcessDropInInteracAccountArgs  extends BaseProcessDropInArgs  {

    
    /**
     * This model encapsulates the details required to manage Interac payment methods for customers. It is used to facilitate electronic funds transfers via the Interac network, a widely used payment system in Canada.
     */
    @JsonProperty("InteracInformation")
    private Interac interacInformation;


    
    public ProcessDropInInteracAccountArgs() {
    }

    
    public ProcessDropInInteracAccountArgs(Interac interacInformation) {
        this.interacInformation = interacInformation;
    }
    
    
    public ProcessDropInInteracAccountArgs(boolean isPPAAuthorized, Interac interacInformation) {
        super(isPPAAuthorized);
        this.interacInformation = interacInformation;
    }

    
    public Interac getInteracInformation() {
        return interacInformation;
    }

    public void setInteracInformation(Interac interacInformation) {
        this.interacInformation = interacInformation;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProcessDropInInteracAccountArgs that = (ProcessDropInInteracAccountArgs) o;
        return Objects.equals(interacInformation, that.interacInformation) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(interacInformation);
    }

    @Override
    public String toString() {
        return "ProcessDropInInteracAccountArgs{" +
                "interacInformation='" + interacInformation + '\'' +

                '}';
    }
}