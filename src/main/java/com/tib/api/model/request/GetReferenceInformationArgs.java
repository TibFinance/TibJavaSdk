
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.GetReferenceInformationType;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class GetReferenceInformationArgs  implements IBaseCryptedServiceArgs  {

    
    /**
 * 
 */
    @JsonProperty("ReferenceData")
    private String referenceData;

    /**
 * 
 */
    @JsonProperty("ReferenceInformationType")
    private GetReferenceInformationType referenceInformationType;


    
    public GetReferenceInformationArgs() {
    }

    
    public GetReferenceInformationArgs(String referenceData, GetReferenceInformationType referenceInformationType) {
        this.referenceData = referenceData;
this.referenceInformationType = referenceInformationType;

    }
    
    

    
    public String getReferenceData() {
        return referenceData;
    }

    public void setReferenceData(String referenceData) {
        this.referenceData = referenceData;
    }

    public GetReferenceInformationType getReferenceInformationType() {
        return referenceInformationType;
    }

    public void setReferenceInformationType(GetReferenceInformationType referenceInformationType) {
        this.referenceInformationType = referenceInformationType;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetReferenceInformationArgs that = (GetReferenceInformationArgs) o;
        return Objects.equals(referenceData, that.referenceData) && Objects.equals(referenceInformationType, that.referenceInformationType) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(referenceData, referenceInformationType);
    }

    @Override
    public String toString() {
        return "GetReferenceInformationArgs{" +
                 "referenceData='" + referenceData + '\'' +
 ", referenceInformationType='" + referenceInformationType + '\'' +

                '}';
    }
}