
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.request.BaseAuthenticatedCryptedArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class SupplierConfirmGenerateFullLoginArgs  extends BaseAuthenticatedCryptedArgs  {

    

    
    public SupplierConfirmGenerateFullLoginArgs() {
    }

    
    
    
    public SupplierConfirmGenerateFullLoginArgs(String sessionToken) {
        super(sessionToken);
    }

    


    

    

    @Override
    public String toString() {
        return "SupplierConfirmGenerateFullLoginArgs{" +
                
                '}';
    }
}