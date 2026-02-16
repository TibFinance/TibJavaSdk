
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.DasProviderType;
import com.tib.api.model.enums.DasProviderCanadaFileType;
import com.tib.api.model.enums.DasProviderCanadaDeclarationFrequency;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class DasProviderCanada  extends DasProviderEntityCanada  {

    
    /**
     * 
     */
    @JsonProperty("ProviderId")
    private String providerId;


    
    public DasProviderCanada() {
    }

    
    public DasProviderCanada(String providerId) {
        this.providerId = providerId;
    }
    
    
    public DasProviderCanada(DasProviderType dasProviderType, String businessName, String businessOrAccountNumber, DasProviderCanadaFileType fileType, String fileNumber, DasProviderCanadaDeclarationFrequency declarationFrequency, String description, String providerId) {
        super(dasProviderType, businessName, businessOrAccountNumber, fileType, fileNumber, declarationFrequency, description);
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
        DasProviderCanada that = (DasProviderCanada) o;
        return Objects.equals(providerId, that.providerId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(providerId);
    }

    @Override
    public String toString() {
        return "DasProviderCanada{" +
                "providerId='" + providerId + '\'' +

                '}';
    }
}