
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.ContractRequestStatus;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class EditionRequest   {

    
    /**
     * 
     */
    @JsonProperty("Content")
    private String content;

    /**
     * Represents the current state of a transaction within the system.
     */
    @JsonProperty("Status")
    private ContractRequestStatus status;

    /**
     * 
     */
    @JsonProperty("CreationDate")
    private String creationDate;


    
    public EditionRequest() {
    }

    
    public EditionRequest(String content, ContractRequestStatus status, String creationDate) {
        this.content = content;
        this.status = status;
        this.creationDate = creationDate;
    }
    
    

    
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ContractRequestStatus getStatus() {
        return status;
    }

    public void setStatus(ContractRequestStatus status) {
        this.status = status;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EditionRequest that = (EditionRequest) o;
        return Objects.equals(content, that.content) && Objects.equals(status, that.status) && Objects.equals(creationDate, that.creationDate) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(content, status, creationDate);
    }

    @Override
    public String toString() {
        return "EditionRequest{" +
                "content='" + content + '\'' +
                ", status='" + status + '\'' +
                ", creationDate='" + creationDate + '\'' +

                '}';
    }
}