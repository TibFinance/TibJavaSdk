
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
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


public class SetGatewayCssArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
 * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
 */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
 * Style to apply on the Gateway
 */
    @JsonProperty("GatewayCss")
    private String gatewayCss;


    
    public SetGatewayCssArgs() {
    }

    
    public SetGatewayCssArgs(String merchantId, String gatewayCss) {
        this.merchantId = merchantId;
this.gatewayCss = gatewayCss;

    }
    
    
    public SetGatewayCssArgs(String sessionToken, String merchantId, String gatewayCss) {
        super(sessionToken);
        this.merchantId = merchantId;
this.gatewayCss = gatewayCss;

    }

    
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getGatewayCss() {
        return gatewayCss;
    }

    public void setGatewayCss(String gatewayCss) {
        this.gatewayCss = gatewayCss;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SetGatewayCssArgs that = (SetGatewayCssArgs) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(gatewayCss, that.gatewayCss) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, gatewayCss);
    }

    @Override
    public String toString() {
        return "SetGatewayCssArgs{" +
                 "merchantId='" + merchantId + '\'' +
 ", gatewayCss='" + gatewayCss + '\'' +

                '}';
    }
}