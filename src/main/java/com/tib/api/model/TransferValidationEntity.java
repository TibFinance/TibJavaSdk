
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.TibAuthorizationStatus;
import com.tib.api.model.enums.ClientAuthorizationStatus;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class TransferValidationEntity   {

    
    /**
     * Retrieves or assigns the monetary amount involved in the transaction.
     */
    @JsonProperty("Amount")
    private Double amount;

    /**
     * The date and time when the payment was created.
     */
    @JsonProperty("CreatedDate")
    private LocalDateTime createdDate;

    /**
     * Gets or sets the acount number.
     */
    @JsonProperty("AcountNumber")
    private String acountNumber;

    /**
     * Gets or sets the external reference number used to link this entity with an external system or business process.
     */
    @JsonProperty("ExternalReferenceNumber")
    private String externalReferenceNumber;

    /**
     * Represents the unique identifier for a group within the TIB Finance API.
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * Gets or sets the tib authorization.
     */
    @JsonProperty("TibAuthorization")
    private TibAuthorizationStatus tibAuthorization;

    /**
     * Gets or sets the tib authorization status string.
     */
    @JsonProperty("TibAuthorizationStatusStr")
    private String tibAuthorizationStatusStr;

    /**
     * Gets or sets the client authorization.
     */
    @JsonProperty("ClientAuthorization")
    private ClientAuthorizationStatus clientAuthorization;

    /**
     * Gets or sets the client authorization status string.
     */
    @JsonProperty("ClientAuthorizationStatusStr")
    private String clientAuthorizationStatusStr;

    /**
     * Represents the merchant's unique name.
     */
    @JsonProperty("MerchantName")
    private String merchantName;

    /**
     * This property represents the full name of the customer in the system.
     */
    @JsonProperty("CustomerName")
    private String customerName;

    /**
     * Bill model representing a financial invoice in the TIB Finance system.
     */
    @JsonProperty("Bill")
    private String bill;

    /**
     * Defines and manages the type of transfer operation within the system.
     */
    @JsonProperty("TransferType")
    private String transferType;

    /**
     * Identifies the specific transfer operation that needs to be reverted.
     */
    @JsonProperty("TransferId")
    private String transferId;

    /**
     * Serves as a unique identifier for each customer within the system.
     */
    @JsonProperty("CustomerId")
    private String customerId;

    /**
     * Specifies the due date for the payment. If the value is null, the system treats the due date as the current date and time.
     */
    @JsonProperty("DueDate")
    private LocalDateTime dueDate;


    
    public TransferValidationEntity() {
    }

    
    public TransferValidationEntity(Double amount, LocalDateTime createdDate, String acountNumber, String externalReferenceNumber, String groupId, TibAuthorizationStatus tibAuthorization, String tibAuthorizationStatusStr, ClientAuthorizationStatus clientAuthorization, String clientAuthorizationStatusStr, String merchantName, String customerName, String bill, String transferType, String transferId, String customerId, LocalDateTime dueDate) {
        this.amount = amount;
        this.createdDate = createdDate;
        this.acountNumber = acountNumber;
        this.externalReferenceNumber = externalReferenceNumber;
        this.groupId = groupId;
        this.tibAuthorization = tibAuthorization;
        this.tibAuthorizationStatusStr = tibAuthorizationStatusStr;
        this.clientAuthorization = clientAuthorization;
        this.clientAuthorizationStatusStr = clientAuthorizationStatusStr;
        this.merchantName = merchantName;
        this.customerName = customerName;
        this.bill = bill;
        this.transferType = transferType;
        this.transferId = transferId;
        this.customerId = customerId;
        this.dueDate = dueDate;
    }
    
    

    
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getAcountNumber() {
        return acountNumber;
    }

    public void setAcountNumber(String acountNumber) {
        this.acountNumber = acountNumber;
    }

    public String getExternalReferenceNumber() {
        return externalReferenceNumber;
    }

    public void setExternalReferenceNumber(String externalReferenceNumber) {
        this.externalReferenceNumber = externalReferenceNumber;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public TibAuthorizationStatus getTibAuthorization() {
        return tibAuthorization;
    }

    public void setTibAuthorization(TibAuthorizationStatus tibAuthorization) {
        this.tibAuthorization = tibAuthorization;
    }

    public String getTibAuthorizationStatusStr() {
        return tibAuthorizationStatusStr;
    }

    public void setTibAuthorizationStatusStr(String tibAuthorizationStatusStr) {
        this.tibAuthorizationStatusStr = tibAuthorizationStatusStr;
    }

    public ClientAuthorizationStatus getClientAuthorization() {
        return clientAuthorization;
    }

    public void setClientAuthorization(ClientAuthorizationStatus clientAuthorization) {
        this.clientAuthorization = clientAuthorization;
    }

    public String getClientAuthorizationStatusStr() {
        return clientAuthorizationStatusStr;
    }

    public void setClientAuthorizationStatusStr(String clientAuthorizationStatusStr) {
        this.clientAuthorizationStatusStr = clientAuthorizationStatusStr;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getBill() {
        return bill;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public String getTransferType() {
        return transferType;
    }

    public void setTransferType(String transferType) {
        this.transferType = transferType;
    }

    public String getTransferId() {
        return transferId;
    }

    public void setTransferId(String transferId) {
        this.transferId = transferId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransferValidationEntity that = (TransferValidationEntity) o;
        return Objects.equals(amount, that.amount) && Objects.equals(createdDate, that.createdDate) && Objects.equals(acountNumber, that.acountNumber) && Objects.equals(externalReferenceNumber, that.externalReferenceNumber) && Objects.equals(groupId, that.groupId) && Objects.equals(tibAuthorization, that.tibAuthorization) && Objects.equals(tibAuthorizationStatusStr, that.tibAuthorizationStatusStr) && Objects.equals(clientAuthorization, that.clientAuthorization) && Objects.equals(clientAuthorizationStatusStr, that.clientAuthorizationStatusStr) && Objects.equals(merchantName, that.merchantName) && Objects.equals(customerName, that.customerName) && Objects.equals(bill, that.bill) && Objects.equals(transferType, that.transferType) && Objects.equals(transferId, that.transferId) && Objects.equals(customerId, that.customerId) && Objects.equals(dueDate, that.dueDate) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(amount, createdDate, acountNumber, externalReferenceNumber, groupId, tibAuthorization, tibAuthorizationStatusStr, clientAuthorization, clientAuthorizationStatusStr, merchantName, customerName, bill, transferType, transferId, customerId, dueDate);
    }

    @Override
    public String toString() {
        return "TransferValidationEntity{" +
                "amount='" + amount + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", acountNumber='" + acountNumber + '\'' +
                ", externalReferenceNumber='" + externalReferenceNumber + '\'' +
                ", groupId='" + groupId + '\'' +
                ", tibAuthorization='" + tibAuthorization + '\'' +
                ", tibAuthorizationStatusStr='" + tibAuthorizationStatusStr + '\'' +
                ", clientAuthorization='" + clientAuthorization + '\'' +
                ", clientAuthorizationStatusStr='" + clientAuthorizationStatusStr + '\'' +
                ", merchantName='" + merchantName + '\'' +
                ", customerName='" + customerName + '\'' +
                ", bill='" + bill + '\'' +
                ", transferType='" + transferType + '\'' +
                ", transferId='" + transferId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", dueDate='" + dueDate + '\'' +

                '}';
    }
}