
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.WhiteLabeling;
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


public class ListWhiteLabelingResponse extends CustomAPIResponse {

    
    @JsonProperty("WhiteLabelings")
    private List<WhiteLabeling> whiteLabelings;


    public ListWhiteLabelingResponse(Error[] errors, boolean hasError, String messages, List<WhiteLabeling> whiteLabelings) {
        super(errors, hasError, messages);
        this.whiteLabelings = whiteLabelings;

    }

    public ListWhiteLabelingResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.whiteLabelings = (List<WhiteLabeling>) apiResponse.getResponse();

        }
    }

    
    public List<WhiteLabeling> getWhiteLabelings() {
        return whiteLabelings;
    }

    public void setWhiteLabelings(List<WhiteLabeling> whiteLabelings) {
        this.whiteLabelings = whiteLabelings;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListWhiteLabelingResponse that = (ListWhiteLabelingResponse) o;
        return Objects.equals(whiteLabelings, that.whiteLabelings) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(whiteLabelings);
    }

    @Override
    public String toString() {
        return "ListWhiteLabelingResponse{" +
                 "whiteLabelings='" + whiteLabelings + '\'' +

                '}';
    }
}