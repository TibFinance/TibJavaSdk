
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


public class ProviderMerchantCredentialEntity   {

    
    /**
 * 
 */
    @JsonProperty("UserName")
    private String userName;

    /**
 * The 'Password' property is a critical component in user authentication, safeguarding individualized user data.
 */
    @JsonProperty("Password")
    private String password;

    /**
 * 
 */
    @JsonProperty("DataProtectionKey")
    private String dataProtectionKey;

    /**
 * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
 */
    @JsonProperty("MerchantId")
    private String merchantId;


    
    public ProviderMerchantCredentialEntity() {
    }

    
    public ProviderMerchantCredentialEntity(String userName, String password, String dataProtectionKey, String merchantId) {
        this.userName = userName;
this.password = password;
this.dataProtectionKey = dataProtectionKey;
this.merchantId = merchantId;

    }
    
    

    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDataProtectionKey() {
        return dataProtectionKey;
    }

    public void setDataProtectionKey(String dataProtectionKey) {
        this.dataProtectionKey = dataProtectionKey;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProviderMerchantCredentialEntity that = (ProviderMerchantCredentialEntity) o;
        return Objects.equals(userName, that.userName) && Objects.equals(password, that.password) && Objects.equals(dataProtectionKey, that.dataProtectionKey) && Objects.equals(merchantId, that.merchantId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(userName, password, dataProtectionKey, merchantId);
    }

    @Override
    public String toString() {
        return "ProviderMerchantCredentialEntity{" +
                 "userName='" + userName + '\'' +
 ", password='" + password + '\'' +
 ", dataProtectionKey='" + dataProtectionKey + '\'' +
 ", merchantId='" + merchantId + '\'' +

                '}';
    }
}