
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


public class SaveClientArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
 * Identifies the TIB client (account) using its unique GUID.
 */
    @JsonProperty("Client")
    private ClientEntity client;


    
    public SaveClientArgs() {
    }

    
    public SaveClientArgs(ClientEntity client) {
        this.client = client;

    }
    
    
    public SaveClientArgs(String adminSessionToken, ClientEntity client) {
        super(adminSessionToken);
        this.client = client;

    }

    
    public ClientEntity getClient() {
        return client;
    }

    public void setClient(ClientEntity client) {
        this.client = client;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaveClientArgs that = (SaveClientArgs) o;
        return Objects.equals(client, that.client) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(client);
    }

    @Override
    public String toString() {
        return "SaveClientArgs{" +
                 "client='" + client + '\'' +

                '}';
    }
}