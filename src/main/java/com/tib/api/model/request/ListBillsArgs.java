
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.request.BaseAuthenticatedCryptedArgs;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class ListBillsArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * Identifier of the service for which recurring transfers are requested
     */
    @JsonProperty("ServiceId")
    private String serviceId;

    /**
     * The unique identifier of the merchant initiating the payment request.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * The start of the date‑time range for which bills are returned.
     */
    @JsonProperty("FromDateTime")
    private OffsetDateTime fromDateTime;

    /**
     * Upper bound of the billing period for which bills are retrieved.
     */
    @JsonProperty("ToDateTime")
    private OffsetDateTime toDateTime;


    
    public ListBillsArgs() {
    }

    
    public ListBillsArgs(String serviceId, String merchantId, OffsetDateTime fromDateTime, OffsetDateTime toDateTime) {
        this.serviceId = serviceId;
        this.merchantId = merchantId;
        this.fromDateTime = fromDateTime;
        this.toDateTime = toDateTime;
    }
    
    
    public ListBillsArgs(String sessionToken, String serviceId, String merchantId, OffsetDateTime fromDateTime, OffsetDateTime toDateTime) {
        super(sessionToken);
        this.serviceId = serviceId;
        this.merchantId = merchantId;
        this.fromDateTime = fromDateTime;
        this.toDateTime = toDateTime;
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

    public OffsetDateTime getFromDateTime() {
        return fromDateTime;
    }

    public void setFromDateTime(OffsetDateTime fromDateTime) {
        this.fromDateTime = fromDateTime;
    }

    public OffsetDateTime getToDateTime() {
        return toDateTime;
    }

    public void setToDateTime(OffsetDateTime toDateTime) {
        this.toDateTime = toDateTime;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListBillsArgs that = (ListBillsArgs) o;
        return Objects.equals(serviceId, that.serviceId) && Objects.equals(merchantId, that.merchantId) && Objects.equals(fromDateTime, that.fromDateTime) && Objects.equals(toDateTime, that.toDateTime) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(serviceId, merchantId, fromDateTime, toDateTime);
    }

    @Override
    public String toString() {
        return "ListBillsArgs{" +
                "serviceId='" + serviceId + '\'' +
                ", merchantId='" + merchantId + '\'' +
                ", fromDateTime='" + fromDateTime + '\'' +
                ", toDateTime='" + toDateTime + '\'' +

                '}';
    }
}