
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.DasProviderType;
import com.tib.api.model.DasProviderEntityQuebec;
import com.tib.api.model.DasProviderEntityCanada;
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


public class AddNewDasProviderArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
 * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
 */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
 * The provider type to create. Must match with the corresponding object filled.
 */
    @JsonProperty("DasProviderType")
    private DasProviderType dasProviderType;

    /**
 * Quebec provider to be created
 */
    @JsonProperty("DasProviderQuebec")
    private DasProviderEntityQuebec dasProviderQuebec;

    /**
 * Canada provider to be created
 */
    @JsonProperty("DasProviderCanada")
    private DasProviderEntityCanada dasProviderCanada;


    
    public AddNewDasProviderArgs() {
    }

    
    public AddNewDasProviderArgs(String merchantId, DasProviderType dasProviderType, DasProviderEntityQuebec dasProviderQuebec, DasProviderEntityCanada dasProviderCanada) {
        this.merchantId = merchantId;
this.dasProviderType = dasProviderType;
this.dasProviderQuebec = dasProviderQuebec;
this.dasProviderCanada = dasProviderCanada;

    }
    
    
    public AddNewDasProviderArgs(String sessionToken, String merchantId, DasProviderType dasProviderType, DasProviderEntityQuebec dasProviderQuebec, DasProviderEntityCanada dasProviderCanada) {
        super(sessionToken);
        this.merchantId = merchantId;
this.dasProviderType = dasProviderType;
this.dasProviderQuebec = dasProviderQuebec;
this.dasProviderCanada = dasProviderCanada;

    }

    
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public DasProviderType getDasProviderType() {
        return dasProviderType;
    }

    public void setDasProviderType(DasProviderType dasProviderType) {
        this.dasProviderType = dasProviderType;
    }

    public DasProviderEntityQuebec getDasProviderQuebec() {
        return dasProviderQuebec;
    }

    public void setDasProviderQuebec(DasProviderEntityQuebec dasProviderQuebec) {
        this.dasProviderQuebec = dasProviderQuebec;
    }

    public DasProviderEntityCanada getDasProviderCanada() {
        return dasProviderCanada;
    }

    public void setDasProviderCanada(DasProviderEntityCanada dasProviderCanada) {
        this.dasProviderCanada = dasProviderCanada;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddNewDasProviderArgs that = (AddNewDasProviderArgs) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(dasProviderType, that.dasProviderType) && Objects.equals(dasProviderQuebec, that.dasProviderQuebec) && Objects.equals(dasProviderCanada, that.dasProviderCanada) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, dasProviderType, dasProviderQuebec, dasProviderCanada);
    }

    @Override
    public String toString() {
        return "AddNewDasProviderArgs{" +
                 "merchantId='" + merchantId + '\'' +
 ", dasProviderType='" + dasProviderType + '\'' +
 ", dasProviderQuebec='" + dasProviderQuebec + '\'' +
 ", dasProviderCanada='" + dasProviderCanada + '\'' +

                '}';
    }
}