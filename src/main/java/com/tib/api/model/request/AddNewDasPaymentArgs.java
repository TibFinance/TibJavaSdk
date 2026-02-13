
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.DasProviderType;
import com.tib.api.model.DasPaymentCanadaEntity;
import com.tib.api.model.DasPaymentQuebecEntity;
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


public class AddNewDasPaymentArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
 * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
 */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
 * The provider Id on which perform the payment.
 */
    @JsonProperty("DasProviderId")
    private String dasProviderId;

    /**
 * Dertermine which payment object passed will be processed
 */
    @JsonProperty("DasPaymentProviderType")
    private DasProviderType dasPaymentProviderType;

    /**
 * Payment for canada provider
 */
    @JsonProperty("DasPaymentCanada")
    private DasPaymentCanadaEntity dasPaymentCanada;

    /**
 * Payment for Quebec provider
 */
    @JsonProperty("DasPaymentQuebec")
    private DasPaymentQuebecEntity dasPaymentQuebec;


    
    public AddNewDasPaymentArgs() {
    }

    
    public AddNewDasPaymentArgs(String merchantId, String dasProviderId, DasProviderType dasPaymentProviderType, DasPaymentCanadaEntity dasPaymentCanada, DasPaymentQuebecEntity dasPaymentQuebec) {
        this.merchantId = merchantId;
this.dasProviderId = dasProviderId;
this.dasPaymentProviderType = dasPaymentProviderType;
this.dasPaymentCanada = dasPaymentCanada;
this.dasPaymentQuebec = dasPaymentQuebec;

    }
    
    
    public AddNewDasPaymentArgs(String sessionToken, String merchantId, String dasProviderId, DasProviderType dasPaymentProviderType, DasPaymentCanadaEntity dasPaymentCanada, DasPaymentQuebecEntity dasPaymentQuebec) {
        super(sessionToken);
        this.merchantId = merchantId;
this.dasProviderId = dasProviderId;
this.dasPaymentProviderType = dasPaymentProviderType;
this.dasPaymentCanada = dasPaymentCanada;
this.dasPaymentQuebec = dasPaymentQuebec;

    }

    
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getDasProviderId() {
        return dasProviderId;
    }

    public void setDasProviderId(String dasProviderId) {
        this.dasProviderId = dasProviderId;
    }

    public DasProviderType getDasPaymentProviderType() {
        return dasPaymentProviderType;
    }

    public void setDasPaymentProviderType(DasProviderType dasPaymentProviderType) {
        this.dasPaymentProviderType = dasPaymentProviderType;
    }

    public DasPaymentCanadaEntity getDasPaymentCanada() {
        return dasPaymentCanada;
    }

    public void setDasPaymentCanada(DasPaymentCanadaEntity dasPaymentCanada) {
        this.dasPaymentCanada = dasPaymentCanada;
    }

    public DasPaymentQuebecEntity getDasPaymentQuebec() {
        return dasPaymentQuebec;
    }

    public void setDasPaymentQuebec(DasPaymentQuebecEntity dasPaymentQuebec) {
        this.dasPaymentQuebec = dasPaymentQuebec;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddNewDasPaymentArgs that = (AddNewDasPaymentArgs) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(dasProviderId, that.dasProviderId) && Objects.equals(dasPaymentProviderType, that.dasPaymentProviderType) && Objects.equals(dasPaymentCanada, that.dasPaymentCanada) && Objects.equals(dasPaymentQuebec, that.dasPaymentQuebec) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, dasProviderId, dasPaymentProviderType, dasPaymentCanada, dasPaymentQuebec);
    }

    @Override
    public String toString() {
        return "AddNewDasPaymentArgs{" +
                 "merchantId='" + merchantId + '\'' +
 ", dasProviderId='" + dasProviderId + '\'' +
 ", dasPaymentProviderType='" + dasPaymentProviderType + '\'' +
 ", dasPaymentCanada='" + dasPaymentCanada + '\'' +
 ", dasPaymentQuebec='" + dasPaymentQuebec + '\'' +

                '}';
    }
}