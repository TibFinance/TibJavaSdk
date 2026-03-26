
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.SupplierView;
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


public class ListSuppliersResponse extends CustomAPIResponse {

    
    @JsonProperty("Suppliers")
    private List<SupplierView> suppliers;


    public ListSuppliersResponse(Error[] errors, boolean hasError, String messages, List<SupplierView> suppliers) {
        super(errors, hasError, messages);
        this.suppliers = suppliers;
    }

    public ListSuppliersResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.suppliers = (List<SupplierView>) apiResponse.getResponse();
        }
    }

    
    public List<SupplierView> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(List<SupplierView> suppliers) {
        this.suppliers = suppliers;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListSuppliersResponse that = (ListSuppliersResponse) o;
        return Objects.equals(suppliers, that.suppliers) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(suppliers);
    }

    @Override
    public String toString() {
        return "ListSuppliersResponse{" +
                "suppliers='" + suppliers + '\'' +

                '}';
    }
}