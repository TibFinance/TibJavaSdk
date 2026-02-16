
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.DasProviderType;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class DasProviderBase   {

    
    /**
     * 
     */
    @JsonProperty("DasProviderType")
    private DasProviderType dasProviderType;


    
    public DasProviderBase() {
    }

    
    public DasProviderBase(DasProviderType dasProviderType) {
        this.dasProviderType = dasProviderType;
    }
    
    

    
    public DasProviderType getDasProviderType() {
        return dasProviderType;
    }

    public void setDasProviderType(DasProviderType dasProviderType) {
        this.dasProviderType = dasProviderType;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DasProviderBase that = (DasProviderBase) o;
        return Objects.equals(dasProviderType, that.dasProviderType) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(dasProviderType);
    }

    @Override
    public String toString() {
        return "DasProviderBase{" +
                "dasProviderType='" + dasProviderType + '\'' +

                '}';
    }
}