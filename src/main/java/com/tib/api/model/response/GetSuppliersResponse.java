
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


public class GetSuppliersResponse extends CustomAPIResponse {

    
    @JsonProperty("Suppliers")
    private List<Object> suppliers;


    public GetSuppliersResponse(Error[] errors, boolean hasError, String messages, List<Object> suppliers) {
        super(errors, hasError, messages);
        this.suppliers = suppliers;
    }

    public GetSuppliersResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.suppliers = (List<Object>) apiResponse.getResponse();
        }
    }

    
    public List<Object> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(List<Object> suppliers) {
        this.suppliers = suppliers;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetSuppliersResponse that = (GetSuppliersResponse) o;
        return Objects.equals(suppliers, that.suppliers) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(suppliers);
    }

    @Override
    public String toString() {
        return "GetSuppliersResponse{" +
                "suppliers='" + suppliers + '\'' +

                '}';
    }
}