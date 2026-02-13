
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.ProviderAccount;
import com.tib.api.model.enums.Currency;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class SavePaymentMethodOnProviderArgs  implements IBaseCryptedServiceArgs  {

    
    /**
 * 
 */
    @JsonProperty("HostedPaymentToken")
    private String hostedPaymentToken;

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
 * 
 */
    @JsonProperty("CustomerFirstName")
    private String customerFirstName;

    /**
 * 
 */
    @JsonProperty("CustomerLastName")
    private String customerLastName;

    /**
 * 
 */
    @JsonProperty("ZipCode")
    private String zipCode;


    
    public SavePaymentMethodOnProviderArgs() {
    }

    
    public SavePaymentMethodOnProviderArgs(String hostedPaymentToken, List<ProviderAccount> providerCredentials, Currency currency, String merchantId, String customerFirstName, String customerLastName, String zipCode) {
        this.hostedPaymentToken = hostedPaymentToken;
this.providerCredentials = providerCredentials;
this.currency = currency;
this.merchantId = merchantId;
this.customerFirstName = customerFirstName;
this.customerLastName = customerLastName;
this.zipCode = zipCode;

    }
    
    

    
    public String getHostedPaymentToken() {
        return hostedPaymentToken;
    }

    public void setHostedPaymentToken(String hostedPaymentToken) {
        this.hostedPaymentToken = hostedPaymentToken;
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

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SavePaymentMethodOnProviderArgs that = (SavePaymentMethodOnProviderArgs) o;
        return Objects.equals(hostedPaymentToken, that.hostedPaymentToken) && Objects.equals(providerCredentials, that.providerCredentials) && Objects.equals(currency, that.currency) && Objects.equals(merchantId, that.merchantId) && Objects.equals(customerFirstName, that.customerFirstName) && Objects.equals(customerLastName, that.customerLastName) && Objects.equals(zipCode, that.zipCode) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(hostedPaymentToken, providerCredentials, currency, merchantId, customerFirstName, customerLastName, zipCode);
    }

    @Override
    public String toString() {
        return "SavePaymentMethodOnProviderArgs{" +
                 "hostedPaymentToken='" + hostedPaymentToken + '\'' +
 ", providerCredentials='" + providerCredentials + '\'' +
 ", currency='" + currency + '\'' +
 ", merchantId='" + merchantId + '\'' +
 ", customerFirstName='" + customerFirstName + '\'' +
 ", customerLastName='" + customerLastName + '\'' +
 ", zipCode='" + zipCode + '\'' +

                '}';
    }
}