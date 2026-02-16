
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.SearchCustomerRelatedMerchant;
import com.tib.api.model.SearchCustomerRelatedPaymentMethod;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class SearchCustomer   {

    
    /**
     * The ClientId property serves as a distinct identifier for each client, playing a crucial role in the authentication process.
     */
    @JsonProperty("ClientId")
    private String clientId;

    /**
     * 
     */
    @JsonProperty("ClientName")
    private String clientName;

    /**
     * 
     */
    @JsonProperty("ClientIsDeleted")
    private boolean clientIsDeleted;

    /**
     * Generates a unique identifier for a specific service to facilitate the creation of a customer list.
     */
    @JsonProperty("ServiceId")
    private String serviceId;

    /**
     * Retrieves or assigns the service's name.
     */
    @JsonProperty("ServiceName")
    private String serviceName;

    /**
     * 
     */
    @JsonProperty("ServiceIsDeleted")
    private boolean serviceIsDeleted;

    /**
     * 
     */
    @JsonProperty("FoundUpMerchants")
    private List<SearchCustomerRelatedMerchant> foundUpMerchants;

    /**
     * 
     */
    @JsonProperty("RelatedPaymentMethods")
    private List<SearchCustomerRelatedPaymentMethod> relatedPaymentMethods;

    /**
     * Serves as a unique identifier for each customer within the system.
     */
    @JsonProperty("CustomerId")
    private String customerId;

    /**
     * This property represents the full name of the customer in the system.
     */
    @JsonProperty("CustomerName")
    private String customerName;

    /**
     * 
     */
    @JsonProperty("IsCustomerDeleted")
    private boolean isCustomerDeleted;


    
    public SearchCustomer() {
    }

    
    public SearchCustomer(String clientId, String clientName, boolean clientIsDeleted, String serviceId, String serviceName, boolean serviceIsDeleted, List<SearchCustomerRelatedMerchant> foundUpMerchants, List<SearchCustomerRelatedPaymentMethod> relatedPaymentMethods, String customerId, String customerName, boolean isCustomerDeleted) {
        this.clientId = clientId;
        this.clientName = clientName;
        this.clientIsDeleted = clientIsDeleted;
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.serviceIsDeleted = serviceIsDeleted;
        this.foundUpMerchants = foundUpMerchants;
        this.relatedPaymentMethods = relatedPaymentMethods;
        this.customerId = customerId;
        this.customerName = customerName;
        this.isCustomerDeleted = isCustomerDeleted;
    }
    
    

    
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public boolean getClientIsDeleted() {
        return clientIsDeleted;
    }

    public void setClientIsDeleted(boolean clientIsDeleted) {
        this.clientIsDeleted = clientIsDeleted;
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

    public boolean getServiceIsDeleted() {
        return serviceIsDeleted;
    }

    public void setServiceIsDeleted(boolean serviceIsDeleted) {
        this.serviceIsDeleted = serviceIsDeleted;
    }

    public List<SearchCustomerRelatedMerchant> getFoundUpMerchants() {
        return foundUpMerchants;
    }

    public void setFoundUpMerchants(List<SearchCustomerRelatedMerchant> foundUpMerchants) {
        this.foundUpMerchants = foundUpMerchants;
    }

    public List<SearchCustomerRelatedPaymentMethod> getRelatedPaymentMethods() {
        return relatedPaymentMethods;
    }

    public void setRelatedPaymentMethods(List<SearchCustomerRelatedPaymentMethod> relatedPaymentMethods) {
        this.relatedPaymentMethods = relatedPaymentMethods;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public boolean getIsCustomerDeleted() {
        return isCustomerDeleted;
    }

    public void setIsCustomerDeleted(boolean isCustomerDeleted) {
        this.isCustomerDeleted = isCustomerDeleted;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchCustomer that = (SearchCustomer) o;
        return Objects.equals(clientId, that.clientId) && Objects.equals(clientName, that.clientName) && Objects.equals(clientIsDeleted, that.clientIsDeleted) && Objects.equals(serviceId, that.serviceId) && Objects.equals(serviceName, that.serviceName) && Objects.equals(serviceIsDeleted, that.serviceIsDeleted) && Objects.equals(foundUpMerchants, that.foundUpMerchants) && Objects.equals(relatedPaymentMethods, that.relatedPaymentMethods) && Objects.equals(customerId, that.customerId) && Objects.equals(customerName, that.customerName) && Objects.equals(isCustomerDeleted, that.isCustomerDeleted) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(clientId, clientName, clientIsDeleted, serviceId, serviceName, serviceIsDeleted, foundUpMerchants, relatedPaymentMethods, customerId, customerName, isCustomerDeleted);
    }

    @Override
    public String toString() {
        return "SearchCustomer{" +
                "clientId='" + clientId + '\'' +
                ", clientName='" + clientName + '\'' +
                ", clientIsDeleted='" + clientIsDeleted + '\'' +
                ", serviceId='" + serviceId + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", serviceIsDeleted='" + serviceIsDeleted + '\'' +
                ", foundUpMerchants='" + foundUpMerchants + '\'' +
                ", relatedPaymentMethods='" + relatedPaymentMethods + '\'' +
                ", customerId='" + customerId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", isCustomerDeleted='" + isCustomerDeleted + '\'' +

                '}';
    }
}