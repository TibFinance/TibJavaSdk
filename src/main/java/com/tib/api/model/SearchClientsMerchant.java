
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


public class SearchClientsMerchant   {

    
    /**
 * The ClientId property serves as a distinct identifier for each client, playing a crucial role in the authentication process.
 */
    @JsonProperty("ClientId")
    private String clientId;

    /**
 * 
 */
    @JsonProperty("ClientName")
    private String clientName;

    /**
 * 
 */
    @JsonProperty("ClientIsDeleted")
    private boolean clientIsDeleted;

    /**
 * Generates a unique identifier for a specific service to facilitate the creation of a customer list.
 */
    @JsonProperty("ServiceId")
    private String serviceId;

    /**
 * Retrieves or assigns the service's name.
 */
    @JsonProperty("ServiceName")
    private String serviceName;

    /**
 * 
 */
    @JsonProperty("ServiceIsDeleted")
    private boolean serviceIsDeleted;

    /**
 * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
 */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
 * Represents the merchant's unique name.
 */
    @JsonProperty("MerchantName")
    private String merchantName;

    /**
 * 
 */
    @JsonProperty("MerchantIsDeleted")
    private boolean merchantIsDeleted;


    
    public SearchClientsMerchant() {
    }

    
    public SearchClientsMerchant(String clientId, String clientName, boolean clientIsDeleted, String serviceId, String serviceName, boolean serviceIsDeleted, String merchantId, String merchantName, boolean merchantIsDeleted) {
        this.clientId = clientId;
this.clientName = clientName;
this.clientIsDeleted = clientIsDeleted;
this.serviceId = serviceId;
this.serviceName = serviceName;
this.serviceIsDeleted = serviceIsDeleted;
this.merchantId = merchantId;
this.merchantName = merchantName;
this.merchantIsDeleted = merchantIsDeleted;

    }
    
    

    
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public boolean getClientIsDeleted() {
        return clientIsDeleted;
    }

    public void setClientIsDeleted(boolean clientIsDeleted) {
        this.clientIsDeleted = clientIsDeleted;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public boolean getServiceIsDeleted() {
        return serviceIsDeleted;
    }

    public void setServiceIsDeleted(boolean serviceIsDeleted) {
        this.serviceIsDeleted = serviceIsDeleted;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public boolean getMerchantIsDeleted() {
        return merchantIsDeleted;
    }

    public void setMerchantIsDeleted(boolean merchantIsDeleted) {
        this.merchantIsDeleted = merchantIsDeleted;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchClientsMerchant that = (SearchClientsMerchant) o;
        return Objects.equals(clientId, that.clientId) && Objects.equals(clientName, that.clientName) && Objects.equals(clientIsDeleted, that.clientIsDeleted) && Objects.equals(serviceId, that.serviceId) && Objects.equals(serviceName, that.serviceName) && Objects.equals(serviceIsDeleted, that.serviceIsDeleted) && Objects.equals(merchantId, that.merchantId) && Objects.equals(merchantName, that.merchantName) && Objects.equals(merchantIsDeleted, that.merchantIsDeleted) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(clientId, clientName, clientIsDeleted, serviceId, serviceName, serviceIsDeleted, merchantId, merchantName, merchantIsDeleted);
    }

    @Override
    public String toString() {
        return "SearchClientsMerchant{" +
                 "clientId='" + clientId + '\'' +
 ", clientName='" + clientName + '\'' +
 ", clientIsDeleted='" + clientIsDeleted + '\'' +
 ", serviceId='" + serviceId + '\'' +
 ", serviceName='" + serviceName + '\'' +
 ", serviceIsDeleted='" + serviceIsDeleted + '\'' +
 ", merchantId='" + merchantId + '\'' +
 ", merchantName='" + merchantName + '\'' +
 ", merchantIsDeleted='" + merchantIsDeleted + '\'' +

                '}';
    }
}