
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.ProviderAccount;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class GetAccountInformationArgs  implements IBaseCryptedServiceArgs  {

    
    /**
 * Gets or sets the providers to call.
 */
    @JsonProperty("ProvidersToCall")
    private List<ProviderAccount> providersToCall;


    
    public GetAccountInformationArgs() {
    }

    
    public GetAccountInformationArgs(List<ProviderAccount> providersToCall) {
        this.providersToCall = providersToCall;

    }
    
    

    
    public List<ProviderAccount> getProvidersToCall() {
        return providersToCall;
    }

    public void setProvidersToCall(List<ProviderAccount> providersToCall) {
        this.providersToCall = providersToCall;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetAccountInformationArgs that = (GetAccountInformationArgs) o;
        return Objects.equals(providersToCall, that.providersToCall) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(providersToCall);
    }

    @Override
    public String toString() {
        return "GetAccountInformationArgs{" +
                 "providersToCall='" + providersToCall + '\'' +

                '}';
    }
}