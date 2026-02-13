
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


public class ListAllClientBoardingResponse extends CustomAPIResponse {

    
    @JsonProperty("List")
    private List<Object> list;


    public ListAllClientBoardingResponse(Error[] errors, boolean hasError, String messages, List<Object> list) {
        super(errors, hasError, messages);
        this.list = list;

    }

    public ListAllClientBoardingResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.list = (List<Object>) apiResponse.getResponse();

        }
    }

    
    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListAllClientBoardingResponse that = (ListAllClientBoardingResponse) o;
        return Objects.equals(list, that.list) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(list);
    }

    @Override
    public String toString() {
        return "ListAllClientBoardingResponse{" +
                 "list='" + list + '\'' +

                '}';
    }
}