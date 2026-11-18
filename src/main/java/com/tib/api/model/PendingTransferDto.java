
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class PendingTransferDto   {

    
    /**
     * The unique identifier of the transfer.
     */
    @JsonProperty("TransferId")
    private String transferId;

    /**
     * The transfer amount.
     */
    @JsonProperty("Amount")
    private Double amount;

    /**
     * The kind of transfer, "Collection" or "Deposit"; it does not say which side of the transfer you are on. A payment to a supplier reads "Collection" for the paying merchant and for the supplier.
     */
    @JsonProperty("Direction")
    private String direction;

    /**
     * The name of the customer of the transfer; empty when the transfer has no customer. For a payment to a supplier, it is the paying merchant.
     */
    @JsonProperty("CustomerName")
    private String customerName;

    /**
     * The date and time when the transfer was created, in UTC.
     */
    @JsonProperty("CreatedDate")
    private OffsetDateTime createdDate;

    /**
     * The unique identifier of your service the transfer is listed under. For a payment to a supplier, the paying merchant and the supplier each read their own service.
     */
    @JsonProperty("ServiceId")
    private String serviceId;

    /**
     * The name of your service the transfer is listed under.
     */
    @JsonProperty("ServiceName")
    private String serviceName;


    
    public PendingTransferDto() {
    }

    
    public PendingTransferDto(String transferId, Double amount, String direction, String customerName, OffsetDateTime createdDate, String serviceId, String serviceName) {
        this.transferId = transferId;
        this.amount = amount;
        this.direction = direction;
        this.customerName = customerName;
        this.createdDate = createdDate;
        this.serviceId = serviceId;
        this.serviceName = serviceName;
    }
    
    

    
    public String getTransferId() {
        return transferId;
    }

    public void setTransferId(String transferId) {
        this.transferId = transferId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public OffsetDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(OffsetDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PendingTransferDto that = (PendingTransferDto) o;
        return Objects.equals(transferId, that.transferId) && Objects.equals(amount, that.amount) && Objects.equals(direction, that.direction) && Objects.equals(customerName, that.customerName) && Objects.equals(createdDate, that.createdDate) && Objects.equals(serviceId, that.serviceId) && Objects.equals(serviceName, that.serviceName) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(transferId, amount, direction, customerName, createdDate, serviceId, serviceName);
    }

    @Override
    public String toString() {
        return "PendingTransferDto{" +
                "transferId='" + transferId + '\'' +
                ", amount='" + amount + '\'' +
                ", direction='" + direction + '\'' +
                ", customerName='" + customerName + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", serviceId='" + serviceId + '\'' +
                ", serviceName='" + serviceName + '\'' +

                '}';
    }
}