
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


public class ErrorReportDataArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
 * Date format of dates 0 for canadian format YYYYMMDD 1 for american format MMDDYYYY
 */
    @JsonProperty("Dateformat")
    private Integer dateformat;

    /**
 * Interval span as number of months
 */
    @JsonProperty("Interval")
    private Integer interval;

    /**
 * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
 */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
 * Generates a unique identifier for a specific service to facilitate the creation of a customer list.
 */
    @JsonProperty("ServiceId")
    private String serviceId;

    /**
 * Specifies the starting date for filtering payment due dates.
 */
    @JsonProperty("FromDate")
    private String fromDate;


    
    public ErrorReportDataArgs() {
    }

    
    public ErrorReportDataArgs(Integer dateformat, Integer interval, String merchantId, String serviceId, String fromDate) {
        this.dateformat = dateformat;
this.interval = interval;
this.merchantId = merchantId;
this.serviceId = serviceId;
this.fromDate = fromDate;

    }
    
    
    public ErrorReportDataArgs(String sessionToken, Integer dateformat, Integer interval, String merchantId, String serviceId, String fromDate) {
        super(sessionToken);
        this.dateformat = dateformat;
this.interval = interval;
this.merchantId = merchantId;
this.serviceId = serviceId;
this.fromDate = fromDate;

    }

    
    public Integer getDateformat() {
        return dateformat;
    }

    public void setDateformat(Integer dateformat) {
        this.dateformat = dateformat;
    }

    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ErrorReportDataArgs that = (ErrorReportDataArgs) o;
        return Objects.equals(dateformat, that.dateformat) && Objects.equals(interval, that.interval) && Objects.equals(merchantId, that.merchantId) && Objects.equals(serviceId, that.serviceId) && Objects.equals(fromDate, that.fromDate) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(dateformat, interval, merchantId, serviceId, fromDate);
    }

    @Override
    public String toString() {
        return "ErrorReportDataArgs{" +
                 "dateformat='" + dateformat + '\'' +
 ", interval='" + interval + '\'' +
 ", merchantId='" + merchantId + '\'' +
 ", serviceId='" + serviceId + '\'' +
 ", fromDate='" + fromDate + '\'' +

                '}';
    }
}