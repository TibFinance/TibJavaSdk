
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


public class GetFeeCountArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * Gets or sets the month.
     */
    @JsonProperty("Month")
    private Integer month;

    /**
     * Gets or sets the year.
     */
    @JsonProperty("Year")
    private Integer year;


    
    public GetFeeCountArgs() {
    }

    
    public GetFeeCountArgs(String merchantId, Integer month, Integer year) {
        this.merchantId = merchantId;
        this.month = month;
        this.year = year;
    }
    
    
    public GetFeeCountArgs(String sessionToken, String merchantId, Integer month, Integer year) {
        super(sessionToken);
        this.merchantId = merchantId;
        this.month = month;
        this.year = year;
    }

    
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetFeeCountArgs that = (GetFeeCountArgs) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(month, that.month) && Objects.equals(year, that.year) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, month, year);
    }

    @Override
    public String toString() {
        return "GetFeeCountArgs{" +
                "merchantId='" + merchantId + '\'' +
                ", month='" + month + '\'' +
                ", year='" + year + '\'' +

                '}';
    }
}