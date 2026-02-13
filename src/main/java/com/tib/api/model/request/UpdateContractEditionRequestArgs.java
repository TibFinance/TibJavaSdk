
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.request.BaseAdminOnlyCryptedArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class UpdateContractEditionRequestArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
 * 
 */
    @JsonProperty("ContractEditionRequestId")
    private Integer contractEditionRequestId;


    
    public UpdateContractEditionRequestArgs() {
    }

    
    public UpdateContractEditionRequestArgs(Integer contractEditionRequestId) {
        this.contractEditionRequestId = contractEditionRequestId;

    }
    
    
    public UpdateContractEditionRequestArgs(String adminSessionToken, Integer contractEditionRequestId) {
        super(adminSessionToken);
        this.contractEditionRequestId = contractEditionRequestId;

    }

    
    public Integer getContractEditionRequestId() {
        return contractEditionRequestId;
    }

    public void setContractEditionRequestId(Integer contractEditionRequestId) {
        this.contractEditionRequestId = contractEditionRequestId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UpdateContractEditionRequestArgs that = (UpdateContractEditionRequestArgs) o;
        return Objects.equals(contractEditionRequestId, that.contractEditionRequestId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(contractEditionRequestId);
    }

    @Override
    public String toString() {
        return "UpdateContractEditionRequestArgs{" +
                 "contractEditionRequestId='" + contractEditionRequestId + '\'' +

                '}';
    }
}