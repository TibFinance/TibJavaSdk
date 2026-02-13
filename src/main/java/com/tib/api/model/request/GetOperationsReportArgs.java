
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.TransferType;
import com.tib.api.model.enums.OperationTarget;
import com.tib.api.model.enums.OperationCategoryReportType;
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


public class GetOperationsReportArgs  extends BaseAuthenticatedCryptedArgs  {

    
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
 * 
 */
    @JsonProperty("DateFrom")
    private LocalDateTime dateFrom;

    /**
 * 
 */
    @JsonProperty("DateTo")
    private LocalDateTime dateTo;

    /**
 * Defines and manages the type of transfer operation within the system.
 */
    @JsonProperty("TransferType")
    private TransferType transferType;

    /**
 * 
 */
    @JsonProperty("TargetType")
    private OperationTarget targetType;

    /**
 * 
 */
    @JsonProperty("ReturnTransferList")
    private boolean returnTransferList;

    /**
 * 
 */
    @JsonProperty("LimitToSpecificCategory")
    private OperationCategoryReportType limitToSpecificCategory;


    
    public GetOperationsReportArgs() {
    }

    
    public GetOperationsReportArgs(String merchantId, String serviceId, LocalDateTime dateFrom, LocalDateTime dateTo, TransferType transferType, OperationTarget targetType, boolean returnTransferList, OperationCategoryReportType limitToSpecificCategory) {
        this.merchantId = merchantId;
this.serviceId = serviceId;
this.dateFrom = dateFrom;
this.dateTo = dateTo;
this.transferType = transferType;
this.targetType = targetType;
this.returnTransferList = returnTransferList;
this.limitToSpecificCategory = limitToSpecificCategory;

    }
    
    
    public GetOperationsReportArgs(String sessionToken, String merchantId, String serviceId, LocalDateTime dateFrom, LocalDateTime dateTo, TransferType transferType, OperationTarget targetType, boolean returnTransferList, OperationCategoryReportType limitToSpecificCategory) {
        super(sessionToken);
        this.merchantId = merchantId;
this.serviceId = serviceId;
this.dateFrom = dateFrom;
this.dateTo = dateTo;
this.transferType = transferType;
this.targetType = targetType;
this.returnTransferList = returnTransferList;
this.limitToSpecificCategory = limitToSpecificCategory;

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

    public TransferType getTransferType() {
        return transferType;
    }

    public void setTransferType(TransferType transferType) {
        this.transferType = transferType;
    }

    public OperationTarget getTargetType() {
        return targetType;
    }

    public void setTargetType(OperationTarget targetType) {
        this.targetType = targetType;
    }

    public boolean getReturnTransferList() {
        return returnTransferList;
    }

    public void setReturnTransferList(boolean returnTransferList) {
        this.returnTransferList = returnTransferList;
    }

    public OperationCategoryReportType getLimitToSpecificCategory() {
        return limitToSpecificCategory;
    }

    public void setLimitToSpecificCategory(OperationCategoryReportType limitToSpecificCategory) {
        this.limitToSpecificCategory = limitToSpecificCategory;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetOperationsReportArgs that = (GetOperationsReportArgs) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(serviceId, that.serviceId) && Objects.equals(dateFrom, that.dateFrom) && Objects.equals(dateTo, that.dateTo) && Objects.equals(transferType, that.transferType) && Objects.equals(targetType, that.targetType) && Objects.equals(returnTransferList, that.returnTransferList) && Objects.equals(limitToSpecificCategory, that.limitToSpecificCategory) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, serviceId, dateFrom, dateTo, transferType, targetType, returnTransferList, limitToSpecificCategory);
    }

    @Override
    public String toString() {
        return "GetOperationsReportArgs{" +
                 "merchantId='" + merchantId + '\'' +
 ", serviceId='" + serviceId + '\'' +
 ", dateFrom='" + dateFrom + '\'' +
 ", dateTo='" + dateTo + '\'' +
 ", transferType='" + transferType + '\'' +
 ", targetType='" + targetType + '\'' +
 ", returnTransferList='" + returnTransferList + '\'' +
 ", limitToSpecificCategory='" + limitToSpecificCategory + '\'' +

                '}';
    }
}