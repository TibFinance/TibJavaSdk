
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.PaymentMethodType;
import com.tib.api.model.enums.OperationKind;
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


public class GetFeesReportArgs  extends BaseAuthenticatedCryptedArgs  {

    
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
 * Gets or sets the start date for the report period.
 */
    @JsonProperty("DateFrom")
    private LocalDateTime dateFrom;

    /**
 * Gets or sets the end date for the report period.
 */
    @JsonProperty("DateTo")
    private LocalDateTime dateTo;

    /**
 * Identifies the type of payment method linked to a specific account.
 */
    @JsonProperty("PaymentMethodType")
    private PaymentMethodType paymentMethodType;

    /**
 * Gets or sets the fee type filter (optional).
 */
    @JsonProperty("FeeType")
    private OperationKind feeType;

    /**
 * Gets or sets whether to include individual fee records in the response.
 */
    @JsonProperty("IncludeDetails")
    private boolean includeDetails;


    
    public GetFeesReportArgs() {
    }

    
    public GetFeesReportArgs(String merchantId, String serviceId, LocalDateTime dateFrom, LocalDateTime dateTo, PaymentMethodType paymentMethodType, OperationKind feeType, boolean includeDetails) {
        this.merchantId = merchantId;
this.serviceId = serviceId;
this.dateFrom = dateFrom;
this.dateTo = dateTo;
this.paymentMethodType = paymentMethodType;
this.feeType = feeType;
this.includeDetails = includeDetails;

    }
    
    
    public GetFeesReportArgs(String sessionToken, String merchantId, String serviceId, LocalDateTime dateFrom, LocalDateTime dateTo, PaymentMethodType paymentMethodType, OperationKind feeType, boolean includeDetails) {
        super(sessionToken);
        this.merchantId = merchantId;
this.serviceId = serviceId;
this.dateFrom = dateFrom;
this.dateTo = dateTo;
this.paymentMethodType = paymentMethodType;
this.feeType = feeType;
this.includeDetails = includeDetails;

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

    public LocalDateTime getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDateTime dateFrom) {
        this.dateFrom = dateFrom;
    }

    public LocalDateTime getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDateTime dateTo) {
        this.dateTo = dateTo;
    }

    public PaymentMethodType getPaymentMethodType() {
        return paymentMethodType;
    }

    public void setPaymentMethodType(PaymentMethodType paymentMethodType) {
        this.paymentMethodType = paymentMethodType;
    }

    public OperationKind getFeeType() {
        return feeType;
    }

    public void setFeeType(OperationKind feeType) {
        this.feeType = feeType;
    }

    public boolean getIncludeDetails() {
        return includeDetails;
    }

    public void setIncludeDetails(boolean includeDetails) {
        this.includeDetails = includeDetails;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetFeesReportArgs that = (GetFeesReportArgs) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(serviceId, that.serviceId) && Objects.equals(dateFrom, that.dateFrom) && Objects.equals(dateTo, that.dateTo) && Objects.equals(paymentMethodType, that.paymentMethodType) && Objects.equals(feeType, that.feeType) && Objects.equals(includeDetails, that.includeDetails) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, serviceId, dateFrom, dateTo, paymentMethodType, feeType, includeDetails);
    }

    @Override
    public String toString() {
        return "GetFeesReportArgs{" +
                 "merchantId='" + merchantId + '\'' +
 ", serviceId='" + serviceId + '\'' +
 ", dateFrom='" + dateFrom + '\'' +
 ", dateTo='" + dateTo + '\'' +
 ", paymentMethodType='" + paymentMethodType + '\'' +
 ", feeType='" + feeType + '\'' +
 ", includeDetails='" + includeDetails + '\'' +

                '}';
    }
}