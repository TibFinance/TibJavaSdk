
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.Account;
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


public class CheckOppositionArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * Generates a unique identifier for a specific service to facilitate the creation of a customer list.
     */
    @JsonProperty("ServiceId")
    private String serviceId;

    /**
     * Contains the necessary details for replacing a merchant's account information within the system.
     */
    @JsonProperty("Account")
    private Account account;


    
    public CheckOppositionArgs() {
    }

    
    public CheckOppositionArgs(String serviceId, Account account) {
        this.serviceId = serviceId;
        this.account = account;
    }
    
    
    public CheckOppositionArgs(String sessionToken, String serviceId, Account account) {
        super(sessionToken);
        this.serviceId = serviceId;
        this.account = account;
    }

    
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CheckOppositionArgs that = (CheckOppositionArgs) o;
        return Objects.equals(serviceId, that.serviceId) && Objects.equals(account, that.account) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(serviceId, account);
    }

    @Override
    public String toString() {
        return "CheckOppositionArgs{" +
                "serviceId='" + serviceId + '\'' +
                ", account='" + account + '\'' +

                '}';
    }
}