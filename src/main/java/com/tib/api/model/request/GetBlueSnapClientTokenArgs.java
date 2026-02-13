
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.ProviderAccount;
import com.tib.api.model.enums.Currency;
import com.tib.api.model.TransactionMailingInfo;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class GetBlueSnapClientTokenArgs  implements IBaseCryptedServiceArgs  {

    
    /**
 * 
 */
    @JsonProperty("ProviderCredentials")
    private List<ProviderAccount> providerCredentials;

    /**
 * Retrieves or assigns the currency type used in transactions.
 */
    @JsonProperty("Currency")
    private Currency currency;

    /**
 * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
 */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
 * Gets or sets the mailing information.
 */
    @JsonProperty("MailingInfo")
    private TransactionMailingInfo mailingInfo;


    
    public GetBlueSnapClientTokenArgs() {
    }

    
    public GetBlueSnapClientTokenArgs(List<ProviderAccount> providerCredentials, Currency currency, String merchantId, TransactionMailingInfo mailingInfo) {
        this.providerCredentials = providerCredentials;
this.currency = currency;
this.merchantId = merchantId;
this.mailingInfo = mailingInfo;

    }
    
    

    
    public List<ProviderAccount> getProviderCredentials() {
        return providerCredentials;
    }

    public void setProviderCredentials(List<ProviderAccount> providerCredentials) {
        this.providerCredentials = providerCredentials;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public TransactionMailingInfo getMailingInfo() {
        return mailingInfo;
    }

    public void setMailingInfo(TransactionMailingInfo mailingInfo) {
        this.mailingInfo = mailingInfo;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetBlueSnapClientTokenArgs that = (GetBlueSnapClientTokenArgs) o;
        return Objects.equals(providerCredentials, that.providerCredentials) && Objects.equals(currency, that.currency) && Objects.equals(merchantId, that.merchantId) && Objects.equals(mailingInfo, that.mailingInfo) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(providerCredentials, currency, merchantId, mailingInfo);
    }

    @Override
    public String toString() {
        return "GetBlueSnapClientTokenArgs{" +
                 "providerCredentials='" + providerCredentials + '\'' +
 ", currency='" + currency + '\'' +
 ", merchantId='" + merchantId + '\'' +
 ", mailingInfo='" + mailingInfo + '\'' +

                '}';
    }
}