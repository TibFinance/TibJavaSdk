
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


public class DeleteMerchantLoginResponse extends CustomAPIResponse {

    

    public DeleteMerchantLoginResponse(Error[] errors, boolean hasError, String messages) {
        super(errors, hasError, messages);
        
    }

    public DeleteMerchantLoginResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            
        }
    }

    


    

    

    @Override
    public String toString() {
        return "DeleteMerchantLoginResponse{" +
                
                '}';
    }
}