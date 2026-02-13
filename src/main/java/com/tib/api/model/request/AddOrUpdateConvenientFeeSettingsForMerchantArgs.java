
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.ConvenientFeeSettings;
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


public class AddOrUpdateConvenientFeeSettingsForMerchantArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
 * 
 */
    @JsonProperty("ConvenientFeeSettings")
    private ConvenientFeeSettings convenientFeeSettings;


    
    public AddOrUpdateConvenientFeeSettingsForMerchantArgs() {
    }

    
    public AddOrUpdateConvenientFeeSettingsForMerchantArgs(ConvenientFeeSettings convenientFeeSettings) {
        this.convenientFeeSettings = convenientFeeSettings;

    }
    
    
    public AddOrUpdateConvenientFeeSettingsForMerchantArgs(String sessionToken, ConvenientFeeSettings convenientFeeSettings) {
        super(sessionToken);
        this.convenientFeeSettings = convenientFeeSettings;

    }

    
    public ConvenientFeeSettings getConvenientFeeSettings() {
        return convenientFeeSettings;
    }

    public void setConvenientFeeSettings(ConvenientFeeSettings convenientFeeSettings) {
        this.convenientFeeSettings = convenientFeeSettings;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddOrUpdateConvenientFeeSettingsForMerchantArgs that = (AddOrUpdateConvenientFeeSettingsForMerchantArgs) o;
        return Objects.equals(convenientFeeSettings, that.convenientFeeSettings) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(convenientFeeSettings);
    }

    @Override
    public String toString() {
        return "AddOrUpdateConvenientFeeSettingsForMerchantArgs{" +
                 "convenientFeeSettings='" + convenientFeeSettings + '\'' +

                '}';
    }
}