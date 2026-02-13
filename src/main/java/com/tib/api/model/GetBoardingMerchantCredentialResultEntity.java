
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


public class GetBoardingMerchantCredentialResultEntity  extends BoardingBaseResult  {

    
    /**
 * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
 */
    @JsonProperty("MerchantId")
    private String merchantId;

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


    
    public GetBoardingMerchantCredentialResultEntity() {
    }

    
    public GetBoardingMerchantCredentialResultEntity(String merchantId, String userName, String password, String dataProtectionKey) {
        this.merchantId = merchantId;
this.userName = userName;
this.password = password;
this.dataProtectionKey = dataProtectionKey;

    }
    
    
    public GetBoardingMerchantCredentialResultEntity(boolean isSuccess, Integer httpStatusCode, String message, List<BoardingBaseError> errorList, String merchantId, String userName, String password, String dataProtectionKey) {
        super(isSuccess, httpStatusCode, message, errorList);
        this.merchantId = merchantId;
this.userName = userName;
this.password = password;
this.dataProtectionKey = dataProtectionKey;

    }

    
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
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



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetBoardingMerchantCredentialResultEntity that = (GetBoardingMerchantCredentialResultEntity) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(userName, that.userName) && Objects.equals(password, that.password) && Objects.equals(dataProtectionKey, that.dataProtectionKey) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, userName, password, dataProtectionKey);
    }

    @Override
    public String toString() {
        return "GetBoardingMerchantCredentialResultEntity{" +
                 "merchantId='" + merchantId + '\'' +
 ", userName='" + userName + '\'' +
 ", password='" + password + '\'' +
 ", dataProtectionKey='" + dataProtectionKey + '\'' +

                '}';
    }
}