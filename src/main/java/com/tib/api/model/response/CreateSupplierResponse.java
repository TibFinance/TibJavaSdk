
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.response.CustomAPIResponse;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class CreateSupplierResponse extends CustomAPIResponse {

    
    @JsonProperty("SupplierId")
    private String supplierId;

    @JsonProperty("SupplierName")
    private String supplierName;


    public CreateSupplierResponse() {
    }

    public CreateSupplierResponse(Error[] errors, boolean hasError, String messages, String supplierId, String supplierName) {
        super(errors, hasError, messages);
        this.supplierId = supplierId;
        this.supplierName = supplierName;
    }

    public CreateSupplierResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String __rawBody = apiResponse.getRawBody();
            if (__rawBody != null && !__rawBody.isEmpty()) {
                CreateSupplierResponse __typed = objectMapper.readValue(__rawBody, CreateSupplierResponse.class);
                this.supplierId = __typed.supplierId;
                this.supplierName = __typed.supplierName;
            }
        }
    }

    
    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateSupplierResponse that = (CreateSupplierResponse) o;
        return Objects.equals(supplierId, that.supplierId) && Objects.equals(supplierName, that.supplierName) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(supplierId, supplierName);
    }

    @Override
    public String toString() {
        return "CreateSupplierResponse{" +
                "supplierId='" + supplierId + '\'' +
                ", supplierName='" + supplierName + '\'' +

                '}';
    }
}