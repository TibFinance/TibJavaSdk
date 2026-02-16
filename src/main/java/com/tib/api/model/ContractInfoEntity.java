
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.BoardingInformationEntity;
import com.tib.api.model.ServiceFeeSettings;
import com.tib.api.model.ServiceSettings;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class ContractInfoEntity   {

    
    /**
     * 
     */
    @JsonProperty("BoardingCompanyInfos")
    private BoardingInformationEntity boardingCompanyInfos;

    /**
     * 
     */
    @JsonProperty("FeeSettings")
    private ServiceFeeSettings feeSettings;

    /**
     * 
     */
    @JsonProperty("LimitationSettings")
    private ServiceSettings limitationSettings;

    /**
     * 
     */
    @JsonProperty("IsSignedContract")
    private boolean isSignedContract;

    /**
     * The ClientId property serves as a distinct identifier for each client, playing a crucial role in the authentication process.
     */
    @JsonProperty("ClientId")
    private String clientId;

    /**
     * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
     */
    @JsonProperty("MerchantId")
    private String merchantId;


    
    public ContractInfoEntity() {
    }

    
    public ContractInfoEntity(BoardingInformationEntity boardingCompanyInfos, ServiceFeeSettings feeSettings, ServiceSettings limitationSettings, boolean isSignedContract, String clientId, String merchantId) {
        this.boardingCompanyInfos = boardingCompanyInfos;
        this.feeSettings = feeSettings;
        this.limitationSettings = limitationSettings;
        this.isSignedContract = isSignedContract;
        this.clientId = clientId;
        this.merchantId = merchantId;
    }
    
    

    
    public BoardingInformationEntity getBoardingCompanyInfos() {
        return boardingCompanyInfos;
    }

    public void setBoardingCompanyInfos(BoardingInformationEntity boardingCompanyInfos) {
        this.boardingCompanyInfos = boardingCompanyInfos;
    }

    public ServiceFeeSettings getFeeSettings() {
        return feeSettings;
    }

    public void setFeeSettings(ServiceFeeSettings feeSettings) {
        this.feeSettings = feeSettings;
    }

    public ServiceSettings getLimitationSettings() {
        return limitationSettings;
    }

    public void setLimitationSettings(ServiceSettings limitationSettings) {
        this.limitationSettings = limitationSettings;
    }

    public boolean getIsSignedContract() {
        return isSignedContract;
    }

    public void setIsSignedContract(boolean isSignedContract) {
        this.isSignedContract = isSignedContract;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
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
        ContractInfoEntity that = (ContractInfoEntity) o;
        return Objects.equals(boardingCompanyInfos, that.boardingCompanyInfos) && Objects.equals(feeSettings, that.feeSettings) && Objects.equals(limitationSettings, that.limitationSettings) && Objects.equals(isSignedContract, that.isSignedContract) && Objects.equals(clientId, that.clientId) && Objects.equals(merchantId, that.merchantId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(boardingCompanyInfos, feeSettings, limitationSettings, isSignedContract, clientId, merchantId);
    }

    @Override
    public String toString() {
        return "ContractInfoEntity{" +
                "boardingCompanyInfos='" + boardingCompanyInfos + '\'' +
                ", feeSettings='" + feeSettings + '\'' +
                ", limitationSettings='" + limitationSettings + '\'' +
                ", isSignedContract='" + isSignedContract + '\'' +
                ", clientId='" + clientId + '\'' +
                ", merchantId='" + merchantId + '\'' +

                '}';
    }
}