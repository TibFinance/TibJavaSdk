
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.request.BaseAdminOnlyCryptedArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class CreateCustomerFromMerchantArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
 * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
 */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
 * The ClientId property serves as a distinct identifier for each client, playing a crucial role in the authentication process.
 */
    @JsonProperty("ClientId")
    private String clientId;

    /**
 * Generates a unique identifier for a specific service to facilitate the creation of a customer list.
 */
    @JsonProperty("ServiceId")
    private String serviceId;


    
    public CreateCustomerFromMerchantArgs() {
    }

    
    public CreateCustomerFromMerchantArgs(String merchantId, String clientId, String serviceId) {
        this.merchantId = merchantId;
this.clientId = clientId;
this.serviceId = serviceId;

    }
    
    
    public CreateCustomerFromMerchantArgs(String adminSessionToken, String merchantId, String clientId, String serviceId) {
        super(adminSessionToken);
        this.merchantId = merchantId;
this.clientId = clientId;
this.serviceId = serviceId;

    }

    
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateCustomerFromMerchantArgs that = (CreateCustomerFromMerchantArgs) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(clientId, that.clientId) && Objects.equals(serviceId, that.serviceId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, clientId, serviceId);
    }

    @Override
    public String toString() {
        return "CreateCustomerFromMerchantArgs{" +
                 "merchantId='" + merchantId + '\'' +
 ", clientId='" + clientId + '\'' +
 ", serviceId='" + serviceId + '\'' +

                '}';
    }
}