
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.response.CustomAPIResponse;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class FindIdResponse extends CustomAPIResponse {

    
    @JsonProperty("RelatedClientId")
    private String relatedClientId;

    @JsonProperty("ClientName")
    private String clientName;

    @JsonProperty("TableName")
    private String tableName;

    @JsonProperty("RelatedDescription")
    private String relatedDescription;


    public FindIdResponse(Error[] errors, boolean hasError, String messages, String relatedClientId, String clientName, String tableName, String relatedDescription) {
        super(errors, hasError, messages);
        this.relatedClientId = relatedClientId;
this.clientName = clientName;
this.tableName = tableName;
this.relatedDescription = relatedDescription;

    }

    public FindIdResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.relatedClientId = apiResponse.getResponse().toString();
this.clientName = apiResponse.getResponse().toString();
this.tableName = apiResponse.getResponse().toString();
this.relatedDescription = apiResponse.getResponse().toString();

        }
    }

    
    public String getRelatedClientId() {
        return relatedClientId;
    }

    public void setRelatedClientId(String relatedClientId) {
        this.relatedClientId = relatedClientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getRelatedDescription() {
        return relatedDescription;
    }

    public void setRelatedDescription(String relatedDescription) {
        this.relatedDescription = relatedDescription;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FindIdResponse that = (FindIdResponse) o;
        return Objects.equals(relatedClientId, that.relatedClientId) && Objects.equals(clientName, that.clientName) && Objects.equals(tableName, that.tableName) && Objects.equals(relatedDescription, that.relatedDescription) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(relatedClientId, clientName, tableName, relatedDescription);
    }

    @Override
    public String toString() {
        return "FindIdResponse{" +
                 "relatedClientId='" + relatedClientId + '\'' +
 ", clientName='" + clientName + '\'' +
 ", tableName='" + tableName + '\'' +
 ", relatedDescription='" + relatedDescription + '\'' +

                '}';
    }
}