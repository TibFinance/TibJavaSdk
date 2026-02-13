
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.request.BaseAuthenticatePublicTokenArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class SaveContractEditionRequestArgs  extends BaseAuthenticatePublicTokenArgs  {

    
    /**
 * Gets and sets the request content for contract edition.
 */
    @JsonProperty("RequestContent")
    private String requestContent;


    
    public SaveContractEditionRequestArgs() {
    }

    
    public SaveContractEditionRequestArgs(String requestContent) {
        this.requestContent = requestContent;

    }
    
    
    public SaveContractEditionRequestArgs(String publicTokenId, String requestContent) {
        super(publicTokenId);
        this.requestContent = requestContent;

    }

    
    public String getRequestContent() {
        return requestContent;
    }

    public void setRequestContent(String requestContent) {
        this.requestContent = requestContent;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaveContractEditionRequestArgs that = (SaveContractEditionRequestArgs) o;
        return Objects.equals(requestContent, that.requestContent) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(requestContent);
    }

    @Override
    public String toString() {
        return "SaveContractEditionRequestArgs{" +
                 "requestContent='" + requestContent + '\'' +

                '}';
    }
}