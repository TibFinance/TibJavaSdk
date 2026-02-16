
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class ContractEditionRequest   {

    
    /**
     * 
     */
    @JsonProperty("ContractEditionRequestId")
    private Integer contractEditionRequestId;

    /**
     * The ClientId property serves as a distinct identifier for each client, playing a crucial role in the authentication process.
     */
    @JsonProperty("ClientId")
    private String clientId;

    /**
     * 
     */
    @JsonProperty("RequestContent")
    private String requestContent;

    /**
     * 
     */
    @JsonProperty("RequestContentPreview")
    private String requestContentPreview;

    /**
     * 
     */
    @JsonProperty("CreatedAt")
    private String createdAt;

    /**
     * 
     */
    @JsonProperty("ProcessedAt")
    private String processedAt;

    /**
     * 
     */
    @JsonProperty("RequestStatus")
    private Integer requestStatus;

    /**
     * The date and time when the payment was created.
     */
    @JsonProperty("CreatedDate")
    private LocalDateTime createdDate;

    /**
     * 
     */
    @JsonProperty("ProcessedDate")
    private LocalDateTime processedDate;


    
    public ContractEditionRequest() {
    }

    
    public ContractEditionRequest(Integer contractEditionRequestId, String clientId, String requestContent, String requestContentPreview, String createdAt, String processedAt, Integer requestStatus, LocalDateTime createdDate, LocalDateTime processedDate) {
        this.contractEditionRequestId = contractEditionRequestId;
        this.clientId = clientId;
        this.requestContent = requestContent;
        this.requestContentPreview = requestContentPreview;
        this.createdAt = createdAt;
        this.processedAt = processedAt;
        this.requestStatus = requestStatus;
        this.createdDate = createdDate;
        this.processedDate = processedDate;
    }
    
    

    
    public Integer getContractEditionRequestId() {
        return contractEditionRequestId;
    }

    public void setContractEditionRequestId(Integer contractEditionRequestId) {
        this.contractEditionRequestId = contractEditionRequestId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getRequestContent() {
        return requestContent;
    }

    public void setRequestContent(String requestContent) {
        this.requestContent = requestContent;
    }

    public String getRequestContentPreview() {
        return requestContentPreview;
    }

    public void setRequestContentPreview(String requestContentPreview) {
        this.requestContentPreview = requestContentPreview;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getProcessedAt() {
        return processedAt;
    }

    public void setProcessedAt(String processedAt) {
        this.processedAt = processedAt;
    }

    public Integer getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(Integer requestStatus) {
        this.requestStatus = requestStatus;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getProcessedDate() {
        return processedDate;
    }

    public void setProcessedDate(LocalDateTime processedDate) {
        this.processedDate = processedDate;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContractEditionRequest that = (ContractEditionRequest) o;
        return Objects.equals(contractEditionRequestId, that.contractEditionRequestId) && Objects.equals(clientId, that.clientId) && Objects.equals(requestContent, that.requestContent) && Objects.equals(requestContentPreview, that.requestContentPreview) && Objects.equals(createdAt, that.createdAt) && Objects.equals(processedAt, that.processedAt) && Objects.equals(requestStatus, that.requestStatus) && Objects.equals(createdDate, that.createdDate) && Objects.equals(processedDate, that.processedDate) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(contractEditionRequestId, clientId, requestContent, requestContentPreview, createdAt, processedAt, requestStatus, createdDate, processedDate);
    }

    @Override
    public String toString() {
        return "ContractEditionRequest{" +
                "contractEditionRequestId='" + contractEditionRequestId + '\'' +
                ", clientId='" + clientId + '\'' +
                ", requestContent='" + requestContent + '\'' +
                ", requestContentPreview='" + requestContentPreview + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", processedAt='" + processedAt + '\'' +
                ", requestStatus='" + requestStatus + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", processedDate='" + processedDate + '\'' +

                '}';
    }
}