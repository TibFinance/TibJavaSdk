
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.WalletAdjustment;
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


public class AdjustWalletArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
 * Generates a unique identifier for a specific service to facilitate the creation of a customer list.
 */
    @JsonProperty("ServiceId")
    private String serviceId;

    /**
 * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
 */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
 * Retrieves or assigns the monetary amount involved in the transaction.
 */
    @JsonProperty("Amount")
    private Double amount;

    /**
 * Defines the mode of wallet adjustment operations.
 */
    @JsonProperty("Mode")
    private WalletAdjustment mode;

    /**
 * 
 */
    @JsonProperty("UseInterac")
    private boolean useInterac;


    
    public AdjustWalletArgs() {
    }

    
    public AdjustWalletArgs(String serviceId, String merchantId, Double amount, WalletAdjustment mode, boolean useInterac) {
        this.serviceId = serviceId;
this.merchantId = merchantId;
this.amount = amount;
this.mode = mode;
this.useInterac = useInterac;

    }
    
    
    public AdjustWalletArgs(String sessionToken, String serviceId, String merchantId, Double amount, WalletAdjustment mode, boolean useInterac) {
        super(sessionToken);
        this.serviceId = serviceId;
this.merchantId = merchantId;
this.amount = amount;
this.mode = mode;
this.useInterac = useInterac;

    }

    
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public WalletAdjustment getMode() {
        return mode;
    }

    public void setMode(WalletAdjustment mode) {
        this.mode = mode;
    }

    public boolean getUseInterac() {
        return useInterac;
    }

    public void setUseInterac(boolean useInterac) {
        this.useInterac = useInterac;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdjustWalletArgs that = (AdjustWalletArgs) o;
        return Objects.equals(serviceId, that.serviceId) && Objects.equals(merchantId, that.merchantId) && Objects.equals(amount, that.amount) && Objects.equals(mode, that.mode) && Objects.equals(useInterac, that.useInterac) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(serviceId, merchantId, amount, mode, useInterac);
    }

    @Override
    public String toString() {
        return "AdjustWalletArgs{" +
                 "serviceId='" + serviceId + '\'' +
 ", merchantId='" + merchantId + '\'' +
 ", amount='" + amount + '\'' +
 ", mode='" + mode + '\'' +
 ", useInterac='" + useInterac + '\'' +

                '}';
    }
}