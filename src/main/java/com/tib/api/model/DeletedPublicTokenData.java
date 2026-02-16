
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.DeletedPublicTokenReason;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class DeletedPublicTokenData   {

    
    /**
     * 
     */
    @JsonProperty("Reason")
    private DeletedPublicTokenReason reason;

    /**
     * 
     */
    @JsonProperty("ReferenceData")
    private String referenceData;


    
    public DeletedPublicTokenData() {
    }

    
    public DeletedPublicTokenData(DeletedPublicTokenReason reason, String referenceData) {
        this.reason = reason;
        this.referenceData = referenceData;
    }
    
    

    
    public DeletedPublicTokenReason getReason() {
        return reason;
    }

    public void setReason(DeletedPublicTokenReason reason) {
        this.reason = reason;
    }

    public String getReferenceData() {
        return referenceData;
    }

    public void setReferenceData(String referenceData) {
        this.referenceData = referenceData;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeletedPublicTokenData that = (DeletedPublicTokenData) o;
        return Objects.equals(reason, that.reason) && Objects.equals(referenceData, that.referenceData) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(reason, referenceData);
    }

    @Override
    public String toString() {
        return "DeletedPublicTokenData{" +
                "reason='" + reason + '\'' +
                ", referenceData='" + referenceData + '\'' +

                '}';
    }
}