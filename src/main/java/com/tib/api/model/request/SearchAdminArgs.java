
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.request.BaseAdminOnlyCryptedArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class SearchAdminArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
     * 
     */
    @JsonProperty("SearchText")
    private String searchText;

    /**
     * The ClientId property serves as a distinct identifier for each client, playing a crucial role in the authentication process.
     */
    @JsonProperty("ClientId")
    private String clientId;

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
     * 
     */
    @JsonProperty("MerchantIds")
    private List<String> merchantIds;

    /**
     * 
     */
    @JsonProperty("CustomerIds")
    private List<String> customerIds;

    /**
     * 
     */
    @JsonProperty("TransferIds")
    private List<String> transferIds;

    /**
     * 
     */
    @JsonProperty("OperationIds")
    private List<String> operationIds;

    /**
     * 
     */
    @JsonProperty("TransactionGroupIds")
    private List<String> transactionGroupIds;

    /**
     * 
     */
    @JsonProperty("TransactionIds")
    private List<String> transactionIds;

    /**
     * Defines and manages the type of transfer operation within the system.
     */
    @JsonProperty("TransferType")
    private Integer transferType;

    /**
     * 
     */
    @JsonProperty("TIBAuthorizationStatus")
    private Integer tIBAuthorizationStatus;

    /**
     * Specifies the target of an operation, indicating whether the operation pertains to the merchant or the customer.
     */
    @JsonProperty("OperationTarget")
    private Integer operationTarget;

    /**
     * Specifies the direction of the operation, indicating whether funds are being collected or deposited.
     */
    @JsonProperty("OperationDirection")
    private Integer operationDirection;

    /**
     * Specifies the category of a financial operation.
     */
    @JsonProperty("OperationKind")
    private Integer operationKind;

    /**
     * Retrieves the numeric status code of an operation.
     */
    @JsonProperty("OperationStatus")
    private Integer operationStatus;

    /**
     * Specifies the operation category used throughout the API.
     */
    @JsonProperty("OperationType")
    private Integer operationType;

    /**
     * 
     */
    @JsonProperty("RowCount")
    private Integer rowCount;

    /**
     * 
     */
    @JsonProperty("IsTextSearch")
    private boolean isTextSearch;

    /**
     * 
     */
    @JsonProperty("IsRevertSearch")
    private boolean isRevertSearch;

    /**
     * 
     */
    @JsonProperty("DueDateFrom")
    private LocalDateTime dueDateFrom;

    /**
     * 
     */
    @JsonProperty("DueDateTo")
    private LocalDateTime dueDateTo;

    /**
     * 
     */
    @JsonProperty("ExecutedFrom")
    private LocalDateTime executedFrom;

    /**
     * 
     */
    @JsonProperty("ExecutedTo")
    private LocalDateTime executedTo;

    /**
     * 
     */
    @JsonProperty("RealDueDateFrom")
    private LocalDateTime realDueDateFrom;

    /**
     * 
     */
    @JsonProperty("RealDueDateTo")
    private LocalDateTime realDueDateTo;

    /**
     * 
     */
    @JsonProperty("LastModifiedDateFrom")
    private LocalDateTime lastModifiedDateFrom;

    /**
     * 
     */
    @JsonProperty("LastModifiedDateTo")
    private LocalDateTime lastModifiedDateTo;

    /**
     * 
     */
    @JsonProperty("IsCreatedDateChecked")
    private boolean isCreatedDateChecked;

    /**
     * 
     */
    @JsonProperty("IsDueDateChecked")
    private boolean isDueDateChecked;

    /**
     * 
     */
    @JsonProperty("IsExecutedDateChecked")
    private boolean isExecutedDateChecked;

    /**
     * 
     */
    @JsonProperty("IsRealDueDateChecked")
    private boolean isRealDueDateChecked;

    /**
     * 
     */
    @JsonProperty("IsLastModifiedDateChecked")
    private boolean isLastModifiedDateChecked;


    
    public SearchAdminArgs() {
    }

    
    public SearchAdminArgs(String searchText, String clientId, LocalDateTime dateFrom, LocalDateTime dateTo, List<String> merchantIds, List<String> customerIds, List<String> transferIds, List<String> operationIds, List<String> transactionGroupIds, List<String> transactionIds, Integer transferType, Integer tIBAuthorizationStatus, Integer operationTarget, Integer operationDirection, Integer operationKind, Integer operationStatus, Integer operationType, Integer rowCount, boolean isTextSearch, boolean isRevertSearch, LocalDateTime dueDateFrom, LocalDateTime dueDateTo, LocalDateTime executedFrom, LocalDateTime executedTo, LocalDateTime realDueDateFrom, LocalDateTime realDueDateTo, LocalDateTime lastModifiedDateFrom, LocalDateTime lastModifiedDateTo, boolean isCreatedDateChecked, boolean isDueDateChecked, boolean isExecutedDateChecked, boolean isRealDueDateChecked, boolean isLastModifiedDateChecked) {
        this.searchText = searchText;
        this.clientId = clientId;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.merchantIds = merchantIds;
        this.customerIds = customerIds;
        this.transferIds = transferIds;
        this.operationIds = operationIds;
        this.transactionGroupIds = transactionGroupIds;
        this.transactionIds = transactionIds;
        this.transferType = transferType;
        this.tIBAuthorizationStatus = tIBAuthorizationStatus;
        this.operationTarget = operationTarget;
        this.operationDirection = operationDirection;
        this.operationKind = operationKind;
        this.operationStatus = operationStatus;
        this.operationType = operationType;
        this.rowCount = rowCount;
        this.isTextSearch = isTextSearch;
        this.isRevertSearch = isRevertSearch;
        this.dueDateFrom = dueDateFrom;
        this.dueDateTo = dueDateTo;
        this.executedFrom = executedFrom;
        this.executedTo = executedTo;
        this.realDueDateFrom = realDueDateFrom;
        this.realDueDateTo = realDueDateTo;
        this.lastModifiedDateFrom = lastModifiedDateFrom;
        this.lastModifiedDateTo = lastModifiedDateTo;
        this.isCreatedDateChecked = isCreatedDateChecked;
        this.isDueDateChecked = isDueDateChecked;
        this.isExecutedDateChecked = isExecutedDateChecked;
        this.isRealDueDateChecked = isRealDueDateChecked;
        this.isLastModifiedDateChecked = isLastModifiedDateChecked;
    }
    
    
    public SearchAdminArgs(String adminSessionToken, String searchText, String clientId, LocalDateTime dateFrom, LocalDateTime dateTo, List<String> merchantIds, List<String> customerIds, List<String> transferIds, List<String> operationIds, List<String> transactionGroupIds, List<String> transactionIds, Integer transferType, Integer tIBAuthorizationStatus, Integer operationTarget, Integer operationDirection, Integer operationKind, Integer operationStatus, Integer operationType, Integer rowCount, boolean isTextSearch, boolean isRevertSearch, LocalDateTime dueDateFrom, LocalDateTime dueDateTo, LocalDateTime executedFrom, LocalDateTime executedTo, LocalDateTime realDueDateFrom, LocalDateTime realDueDateTo, LocalDateTime lastModifiedDateFrom, LocalDateTime lastModifiedDateTo, boolean isCreatedDateChecked, boolean isDueDateChecked, boolean isExecutedDateChecked, boolean isRealDueDateChecked, boolean isLastModifiedDateChecked) {
        super(adminSessionToken);
        this.searchText = searchText;
        this.clientId = clientId;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.merchantIds = merchantIds;
        this.customerIds = customerIds;
        this.transferIds = transferIds;
        this.operationIds = operationIds;
        this.transactionGroupIds = transactionGroupIds;
        this.transactionIds = transactionIds;
        this.transferType = transferType;
        this.tIBAuthorizationStatus = tIBAuthorizationStatus;
        this.operationTarget = operationTarget;
        this.operationDirection = operationDirection;
        this.operationKind = operationKind;
        this.operationStatus = operationStatus;
        this.operationType = operationType;
        this.rowCount = rowCount;
        this.isTextSearch = isTextSearch;
        this.isRevertSearch = isRevertSearch;
        this.dueDateFrom = dueDateFrom;
        this.dueDateTo = dueDateTo;
        this.executedFrom = executedFrom;
        this.executedTo = executedTo;
        this.realDueDateFrom = realDueDateFrom;
        this.realDueDateTo = realDueDateTo;
        this.lastModifiedDateFrom = lastModifiedDateFrom;
        this.lastModifiedDateTo = lastModifiedDateTo;
        this.isCreatedDateChecked = isCreatedDateChecked;
        this.isDueDateChecked = isDueDateChecked;
        this.isExecutedDateChecked = isExecutedDateChecked;
        this.isRealDueDateChecked = isRealDueDateChecked;
        this.isLastModifiedDateChecked = isLastModifiedDateChecked;
    }

    
    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
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

    public List<String> getMerchantIds() {
        return merchantIds;
    }

    public void setMerchantIds(List<String> merchantIds) {
        this.merchantIds = merchantIds;
    }

    public List<String> getCustomerIds() {
        return customerIds;
    }

    public void setCustomerIds(List<String> customerIds) {
        this.customerIds = customerIds;
    }

    public List<String> getTransferIds() {
        return transferIds;
    }

    public void setTransferIds(List<String> transferIds) {
        this.transferIds = transferIds;
    }

    public List<String> getOperationIds() {
        return operationIds;
    }

    public void setOperationIds(List<String> operationIds) {
        this.operationIds = operationIds;
    }

    public List<String> getTransactionGroupIds() {
        return transactionGroupIds;
    }

    public void setTransactionGroupIds(List<String> transactionGroupIds) {
        this.transactionGroupIds = transactionGroupIds;
    }

    public List<String> getTransactionIds() {
        return transactionIds;
    }

    public void setTransactionIds(List<String> transactionIds) {
        this.transactionIds = transactionIds;
    }

    public Integer getTransferType() {
        return transferType;
    }

    public void setTransferType(Integer transferType) {
        this.transferType = transferType;
    }

    public Integer getTIBAuthorizationStatus() {
        return tIBAuthorizationStatus;
    }

    public void setTIBAuthorizationStatus(Integer tIBAuthorizationStatus) {
        this.tIBAuthorizationStatus = tIBAuthorizationStatus;
    }

    public Integer getOperationTarget() {
        return operationTarget;
    }

    public void setOperationTarget(Integer operationTarget) {
        this.operationTarget = operationTarget;
    }

    public Integer getOperationDirection() {
        return operationDirection;
    }

    public void setOperationDirection(Integer operationDirection) {
        this.operationDirection = operationDirection;
    }

    public Integer getOperationKind() {
        return operationKind;
    }

    public void setOperationKind(Integer operationKind) {
        this.operationKind = operationKind;
    }

    public Integer getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(Integer operationStatus) {
        this.operationStatus = operationStatus;
    }

    public Integer getOperationType() {
        return operationType;
    }

    public void setOperationType(Integer operationType) {
        this.operationType = operationType;
    }

    public Integer getRowCount() {
        return rowCount;
    }

    public void setRowCount(Integer rowCount) {
        this.rowCount = rowCount;
    }

    public boolean getIsTextSearch() {
        return isTextSearch;
    }

    public void setIsTextSearch(boolean isTextSearch) {
        this.isTextSearch = isTextSearch;
    }

    public boolean getIsRevertSearch() {
        return isRevertSearch;
    }

    public void setIsRevertSearch(boolean isRevertSearch) {
        this.isRevertSearch = isRevertSearch;
    }

    public LocalDateTime getDueDateFrom() {
        return dueDateFrom;
    }

    public void setDueDateFrom(LocalDateTime dueDateFrom) {
        this.dueDateFrom = dueDateFrom;
    }

    public LocalDateTime getDueDateTo() {
        return dueDateTo;
    }

    public void setDueDateTo(LocalDateTime dueDateTo) {
        this.dueDateTo = dueDateTo;
    }

    public LocalDateTime getExecutedFrom() {
        return executedFrom;
    }

    public void setExecutedFrom(LocalDateTime executedFrom) {
        this.executedFrom = executedFrom;
    }

    public LocalDateTime getExecutedTo() {
        return executedTo;
    }

    public void setExecutedTo(LocalDateTime executedTo) {
        this.executedTo = executedTo;
    }

    public LocalDateTime getRealDueDateFrom() {
        return realDueDateFrom;
    }

    public void setRealDueDateFrom(LocalDateTime realDueDateFrom) {
        this.realDueDateFrom = realDueDateFrom;
    }

    public LocalDateTime getRealDueDateTo() {
        return realDueDateTo;
    }

    public void setRealDueDateTo(LocalDateTime realDueDateTo) {
        this.realDueDateTo = realDueDateTo;
    }

    public LocalDateTime getLastModifiedDateFrom() {
        return lastModifiedDateFrom;
    }

    public void setLastModifiedDateFrom(LocalDateTime lastModifiedDateFrom) {
        this.lastModifiedDateFrom = lastModifiedDateFrom;
    }

    public LocalDateTime getLastModifiedDateTo() {
        return lastModifiedDateTo;
    }

    public void setLastModifiedDateTo(LocalDateTime lastModifiedDateTo) {
        this.lastModifiedDateTo = lastModifiedDateTo;
    }

    public boolean getIsCreatedDateChecked() {
        return isCreatedDateChecked;
    }

    public void setIsCreatedDateChecked(boolean isCreatedDateChecked) {
        this.isCreatedDateChecked = isCreatedDateChecked;
    }

    public boolean getIsDueDateChecked() {
        return isDueDateChecked;
    }

    public void setIsDueDateChecked(boolean isDueDateChecked) {
        this.isDueDateChecked = isDueDateChecked;
    }

    public boolean getIsExecutedDateChecked() {
        return isExecutedDateChecked;
    }

    public void setIsExecutedDateChecked(boolean isExecutedDateChecked) {
        this.isExecutedDateChecked = isExecutedDateChecked;
    }

    public boolean getIsRealDueDateChecked() {
        return isRealDueDateChecked;
    }

    public void setIsRealDueDateChecked(boolean isRealDueDateChecked) {
        this.isRealDueDateChecked = isRealDueDateChecked;
    }

    public boolean getIsLastModifiedDateChecked() {
        return isLastModifiedDateChecked;
    }

    public void setIsLastModifiedDateChecked(boolean isLastModifiedDateChecked) {
        this.isLastModifiedDateChecked = isLastModifiedDateChecked;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchAdminArgs that = (SearchAdminArgs) o;
        return Objects.equals(searchText, that.searchText) && Objects.equals(clientId, that.clientId) && Objects.equals(dateFrom, that.dateFrom) && Objects.equals(dateTo, that.dateTo) && Objects.equals(merchantIds, that.merchantIds) && Objects.equals(customerIds, that.customerIds) && Objects.equals(transferIds, that.transferIds) && Objects.equals(operationIds, that.operationIds) && Objects.equals(transactionGroupIds, that.transactionGroupIds) && Objects.equals(transactionIds, that.transactionIds) && Objects.equals(transferType, that.transferType) && Objects.equals(tIBAuthorizationStatus, that.tIBAuthorizationStatus) && Objects.equals(operationTarget, that.operationTarget) && Objects.equals(operationDirection, that.operationDirection) && Objects.equals(operationKind, that.operationKind) && Objects.equals(operationStatus, that.operationStatus) && Objects.equals(operationType, that.operationType) && Objects.equals(rowCount, that.rowCount) && Objects.equals(isTextSearch, that.isTextSearch) && Objects.equals(isRevertSearch, that.isRevertSearch) && Objects.equals(dueDateFrom, that.dueDateFrom) && Objects.equals(dueDateTo, that.dueDateTo) && Objects.equals(executedFrom, that.executedFrom) && Objects.equals(executedTo, that.executedTo) && Objects.equals(realDueDateFrom, that.realDueDateFrom) && Objects.equals(realDueDateTo, that.realDueDateTo) && Objects.equals(lastModifiedDateFrom, that.lastModifiedDateFrom) && Objects.equals(lastModifiedDateTo, that.lastModifiedDateTo) && Objects.equals(isCreatedDateChecked, that.isCreatedDateChecked) && Objects.equals(isDueDateChecked, that.isDueDateChecked) && Objects.equals(isExecutedDateChecked, that.isExecutedDateChecked) && Objects.equals(isRealDueDateChecked, that.isRealDueDateChecked) && Objects.equals(isLastModifiedDateChecked, that.isLastModifiedDateChecked) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(searchText, clientId, dateFrom, dateTo, merchantIds, customerIds, transferIds, operationIds, transactionGroupIds, transactionIds, transferType, tIBAuthorizationStatus, operationTarget, operationDirection, operationKind, operationStatus, operationType, rowCount, isTextSearch, isRevertSearch, dueDateFrom, dueDateTo, executedFrom, executedTo, realDueDateFrom, realDueDateTo, lastModifiedDateFrom, lastModifiedDateTo, isCreatedDateChecked, isDueDateChecked, isExecutedDateChecked, isRealDueDateChecked, isLastModifiedDateChecked);
    }

    @Override
    public String toString() {
        return "SearchAdminArgs{" +
                "searchText='" + searchText + '\'' +
                ", clientId='" + clientId + '\'' +
                ", dateFrom='" + dateFrom + '\'' +
                ", dateTo='" + dateTo + '\'' +
                ", merchantIds='" + merchantIds + '\'' +
                ", customerIds='" + customerIds + '\'' +
                ", transferIds='" + transferIds + '\'' +
                ", operationIds='" + operationIds + '\'' +
                ", transactionGroupIds='" + transactionGroupIds + '\'' +
                ", transactionIds='" + transactionIds + '\'' +
                ", transferType='" + transferType + '\'' +
                ", tIBAuthorizationStatus='" + tIBAuthorizationStatus + '\'' +
                ", operationTarget='" + operationTarget + '\'' +
                ", operationDirection='" + operationDirection + '\'' +
                ", operationKind='" + operationKind + '\'' +
                ", operationStatus='" + operationStatus + '\'' +
                ", operationType='" + operationType + '\'' +
                ", rowCount='" + rowCount + '\'' +
                ", isTextSearch='" + isTextSearch + '\'' +
                ", isRevertSearch='" + isRevertSearch + '\'' +
                ", dueDateFrom='" + dueDateFrom + '\'' +
                ", dueDateTo='" + dueDateTo + '\'' +
                ", executedFrom='" + executedFrom + '\'' +
                ", executedTo='" + executedTo + '\'' +
                ", realDueDateFrom='" + realDueDateFrom + '\'' +
                ", realDueDateTo='" + realDueDateTo + '\'' +
                ", lastModifiedDateFrom='" + lastModifiedDateFrom + '\'' +
                ", lastModifiedDateTo='" + lastModifiedDateTo + '\'' +
                ", isCreatedDateChecked='" + isCreatedDateChecked + '\'' +
                ", isDueDateChecked='" + isDueDateChecked + '\'' +
                ", isExecutedDateChecked='" + isExecutedDateChecked + '\'' +
                ", isRealDueDateChecked='" + isRealDueDateChecked + '\'' +
                ", isLastModifiedDateChecked='" + isLastModifiedDateChecked + '\'' +

                '}';
    }
}