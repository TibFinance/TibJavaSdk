
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


public class UpdateInfoArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
 * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
 */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
 * 
 */
    @JsonProperty("ClientName")
    private String clientName;

    /**
 * Retrieves or assigns the service's name.
 */
    @JsonProperty("ServiceName")
    private String serviceName;

    /**
 * Represents the merchant's unique name.
 */
    @JsonProperty("MerchantName")
    private String merchantName;

    /**
 * Represents the name associated with the merchant's account.
 */
    @JsonProperty("AccountName")
    private String accountName;


    
    public UpdateInfoArgs() {
    }

    
    public UpdateInfoArgs(String merchantId, String clientName, String serviceName, String merchantName, String accountName) {
        this.merchantId = merchantId;
this.clientName = clientName;
this.serviceName = serviceName;
this.merchantName = merchantName;
this.accountName = accountName;

    }
    
    
    public UpdateInfoArgs(String adminSessionToken, String merchantId, String clientName, String serviceName, String merchantName, String accountName) {
        super(adminSessionToken);
        this.merchantId = merchantId;
this.clientName = clientName;
this.serviceName = serviceName;
this.merchantName = merchantName;
this.accountName = accountName;

    }

    
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UpdateInfoArgs that = (UpdateInfoArgs) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(clientName, that.clientName) && Objects.equals(serviceName, that.serviceName) && Objects.equals(merchantName, that.merchantName) && Objects.equals(accountName, that.accountName) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, clientName, serviceName, merchantName, accountName);
    }

    @Override
    public String toString() {
        return "UpdateInfoArgs{" +
                 "merchantId='" + merchantId + '\'' +
 ", clientName='" + clientName + '\'' +
 ", serviceName='" + serviceName + '\'' +
 ", merchantName='" + merchantName + '\'' +
 ", accountName='" + accountName + '\'' +

                '}';
    }
}