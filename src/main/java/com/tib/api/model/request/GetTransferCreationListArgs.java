
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.request.BaseAuthenticatedCryptedArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class GetTransferCreationListArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * Generates a unique identifier for a specific service to facilitate the creation of a customer list.
     */
    @JsonProperty("ServiceId")
    private String serviceId;

    /**
     * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * Defines and manages the type of transfer operation within the system.
     */
    @JsonProperty("TransferType")
    private String transferType;


    
    public GetTransferCreationListArgs() {
    }

    
    public GetTransferCreationListArgs(String serviceId, String merchantId, String transferType) {
        this.serviceId = serviceId;
        this.merchantId = merchantId;
        this.transferType = transferType;
    }
    
    
    public GetTransferCreationListArgs(String sessionToken, String serviceId, String merchantId, String transferType) {
        super(sessionToken);
        this.serviceId = serviceId;
        this.merchantId = merchantId;
        this.transferType = transferType;
    }

    
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getTransferType() {
        return transferType;
    }

    public void setTransferType(String transferType) {
        this.transferType = transferType;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetTransferCreationListArgs that = (GetTransferCreationListArgs) o;
        return Objects.equals(serviceId, that.serviceId) && Objects.equals(merchantId, that.merchantId) && Objects.equals(transferType, that.transferType) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(serviceId, merchantId, transferType);
    }

    @Override
    public String toString() {
        return "GetTransferCreationListArgs{" +
                "serviceId='" + serviceId + '\'' +
                ", merchantId='" + merchantId + '\'' +
                ", transferType='" + transferType + '\'' +

                '}';
    }
}