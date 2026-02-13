
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


public class GetPaymentInvoiceArgs  implements IBaseCryptedServiceArgs  {

    
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
 * Specifies the starting date for filtering payment due dates.
 */
    @JsonProperty("FromDate")
    private LocalDateTime fromDate;

    /**
 * Specifies the payment due date.
 */
    @JsonProperty("ToDate")
    private LocalDateTime toDate;


    
    public GetPaymentInvoiceArgs() {
    }

    
    public GetPaymentInvoiceArgs(List<ProviderAccount> providerCredentials, Currency currency, String merchantId, LocalDateTime fromDate, LocalDateTime toDate) {
        this.providerCredentials = providerCredentials;
this.currency = currency;
this.merchantId = merchantId;
this.fromDate = fromDate;
this.toDate = toDate;

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

    public LocalDateTime getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDateTime getToDate() {
        return toDate;
    }

    public void setToDate(LocalDateTime toDate) {
        this.toDate = toDate;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetPaymentInvoiceArgs that = (GetPaymentInvoiceArgs) o;
        return Objects.equals(providerCredentials, that.providerCredentials) && Objects.equals(currency, that.currency) && Objects.equals(merchantId, that.merchantId) && Objects.equals(fromDate, that.fromDate) && Objects.equals(toDate, that.toDate) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(providerCredentials, currency, merchantId, fromDate, toDate);
    }

    @Override
    public String toString() {
        return "GetPaymentInvoiceArgs{" +
                 "providerCredentials='" + providerCredentials + '\'' +
 ", currency='" + currency + '\'' +
 ", merchantId='" + merchantId + '\'' +
 ", fromDate='" + fromDate + '\'' +
 ", toDate='" + toDate + '\'' +

                '}';
    }
}