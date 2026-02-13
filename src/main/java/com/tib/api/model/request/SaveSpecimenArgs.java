
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.Account;
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


public class SaveSpecimenArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
 * The ClientId property serves as a distinct identifier for each client, playing a crucial role in the authentication process.
 */
    @JsonProperty("ClientId")
    private String clientId;

    /**
 * Contains the necessary details for replacing a merchant's account information within the system.
 */
    @JsonProperty("Account")
    private Account account;


    
    public SaveSpecimenArgs() {
    }

    
    public SaveSpecimenArgs(String clientId, Account account) {
        this.clientId = clientId;
this.account = account;

    }
    
    
    public SaveSpecimenArgs(String adminSessionToken, String clientId, Account account) {
        super(adminSessionToken);
        this.clientId = clientId;
this.account = account;

    }

    
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
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
        SaveSpecimenArgs that = (SaveSpecimenArgs) o;
        return Objects.equals(clientId, that.clientId) && Objects.equals(account, that.account) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(clientId, account);
    }

    @Override
    public String toString() {
        return "SaveSpecimenArgs{" +
                 "clientId='" + clientId + '\'' +
 ", account='" + account + '\'' +

                '}';
    }
}