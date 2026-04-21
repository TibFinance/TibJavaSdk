
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.RecuringTransfer;
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


public class ListSupplierRecurringTransfersResponse<T> extends CustomAPIResponse {

    
    @JsonProperty("RecurringTransfers")
    private List<RecuringTransfer> recurringTransfers;


    public ListSupplierRecurringTransfersResponse() {
    }

    public ListSupplierRecurringTransfersResponse(Error[] errors, boolean hasError, String messages, List<RecuringTransfer> recurringTransfers) {
        super(errors, hasError, messages);
        this.recurringTransfers = recurringTransfers;
    }

    public ListSupplierRecurringTransfersResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String __rawBody = apiResponse.getRawBody();
            if (__rawBody != null && !__rawBody.isEmpty()) {
                ListSupplierRecurringTransfersResponse __typed = objectMapper.readValue(__rawBody, ListSupplierRecurringTransfersResponse.class);
                this.recurringTransfers = __typed.recurringTransfers;
            }
        }
    }

    
    public List<RecuringTransfer> getRecurringTransfers() {
        return recurringTransfers;
    }

    public void setRecurringTransfers(List<RecuringTransfer> recurringTransfers) {
        this.recurringTransfers = recurringTransfers;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListSupplierRecurringTransfersResponse that = (ListSupplierRecurringTransfersResponse) o;
        return Objects.equals(recurringTransfers, that.recurringTransfers) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(recurringTransfers);
    }

    @Override
    public String toString() {
        return "ListSupplierRecurringTransfersResponse{" +
                "recurringTransfers='" + recurringTransfers + '\'' +

                '}';
    }
}