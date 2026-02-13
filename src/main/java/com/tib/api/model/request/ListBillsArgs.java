
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


public class ListBillsArgs  extends BaseAuthenticatedCryptedArgs  {

    
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
 * Specifies the starting date and time for filtering data.
 */
    @JsonProperty("FromDateTime")
    private LocalDateTime fromDateTime;

    /**
 * Converts a specified date filter to a DateTime object.
 */
    @JsonProperty("ToDateTime")
    private LocalDateTime toDateTime;


    
    public ListBillsArgs() {
    }

    
    public ListBillsArgs(String serviceId, String merchantId, LocalDateTime fromDateTime, LocalDateTime toDateTime) {
        this.serviceId = serviceId;
this.merchantId = merchantId;
this.fromDateTime = fromDateTime;
this.toDateTime = toDateTime;

    }
    
    
    public ListBillsArgs(String sessionToken, String serviceId, String merchantId, LocalDateTime fromDateTime, LocalDateTime toDateTime) {
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

    public LocalDateTime getFromDateTime() {
        return fromDateTime;
    }

    public void setFromDateTime(LocalDateTime fromDateTime) {
        this.fromDateTime = fromDateTime;
    }

    public LocalDateTime getToDateTime() {
        return toDateTime;
    }

    public void setToDateTime(LocalDateTime toDateTime) {
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