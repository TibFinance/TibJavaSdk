
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.BoardingBaseError;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class SavePaymentMethodResultEntity  extends BoardingBaseResult  {

    
    /**
     * 
     */
    @JsonProperty("ProviderGivenIdentification")
    private String providerGivenIdentification;


    
    public SavePaymentMethodResultEntity() {
    }

    
    public SavePaymentMethodResultEntity(String providerGivenIdentification) {
        this.providerGivenIdentification = providerGivenIdentification;
    }
    
    
    public SavePaymentMethodResultEntity(boolean isSuccess, Integer httpStatusCode, String message, List<BoardingBaseError> errorList, String providerGivenIdentification) {
        super(isSuccess, httpStatusCode, message, errorList);
        this.providerGivenIdentification = providerGivenIdentification;
    }

    
    public String getProviderGivenIdentification() {
        return providerGivenIdentification;
    }

    public void setProviderGivenIdentification(String providerGivenIdentification) {
        this.providerGivenIdentification = providerGivenIdentification;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SavePaymentMethodResultEntity that = (SavePaymentMethodResultEntity) o;
        return Objects.equals(providerGivenIdentification, that.providerGivenIdentification) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(providerGivenIdentification);
    }

    @Override
    public String toString() {
        return "SavePaymentMethodResultEntity{" +
                "providerGivenIdentification='" + providerGivenIdentification + '\'' +

                '}';
    }
}