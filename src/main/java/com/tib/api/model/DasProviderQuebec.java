
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.DasProviderType;
import com.tib.api.model.enums.DasProviderQuebecFileType;
import com.tib.api.model.enums.DasProviderQuebecDeclarationFrequency;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class DasProviderQuebec  extends DasProviderEntityQuebec  {

    
    /**
 * 
 */
    @JsonProperty("ProviderId")
    private String providerId;


    
    public DasProviderQuebec() {
    }

    
    public DasProviderQuebec(String providerId) {
        this.providerId = providerId;

    }
    
    
    public DasProviderQuebec(DasProviderType dasProviderType, String identificationNumber, DasProviderQuebecFileType fileType, String fileNumber, DasProviderQuebecDeclarationFrequency declarationFrequency, String description, String providerId) {
        super(dasProviderType, identificationNumber, fileType, fileNumber, declarationFrequency, description);
        this.providerId = providerId;

    }

    
    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DasProviderQuebec that = (DasProviderQuebec) o;
        return Objects.equals(providerId, that.providerId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(providerId);
    }

    @Override
    public String toString() {
        return "DasProviderQuebec{" +
                 "providerId='" + providerId + '\'' +

                '}';
    }
}