
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.ClientEntity;
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


public class CreateClientArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
 * Identifies the TIB client (account) using its unique GUID.
 */
    @JsonProperty("Client")
    private ClientEntity client;

    /**
 * 
 */
    @JsonProperty("KYCDone")
    private boolean kYCDone;


    
    public CreateClientArgs() {
    }

    
    public CreateClientArgs(ClientEntity client, boolean kYCDone) {
        this.client = client;
this.kYCDone = kYCDone;

    }
    
    
    public CreateClientArgs(String adminSessionToken, ClientEntity client, boolean kYCDone) {
        super(adminSessionToken);
        this.client = client;
this.kYCDone = kYCDone;

    }

    
    public ClientEntity getClient() {
        return client;
    }

    public void setClient(ClientEntity client) {
        this.client = client;
    }

    public boolean getKYCDone() {
        return kYCDone;
    }

    public void setKYCDone(boolean kYCDone) {
        this.kYCDone = kYCDone;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateClientArgs that = (CreateClientArgs) o;
        return Objects.equals(client, that.client) && Objects.equals(kYCDone, that.kYCDone) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(client, kYCDone);
    }

    @Override
    public String toString() {
        return "CreateClientArgs{" +
                 "client='" + client + '\'' +
 ", kYCDone='" + kYCDone + '\'' +

                '}';
    }
}