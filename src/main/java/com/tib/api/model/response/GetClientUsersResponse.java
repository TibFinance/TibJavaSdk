
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.ClientLogin;
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


public class GetClientUsersResponse extends CustomAPIResponse {

    
    @JsonProperty("Users")
    private List<ClientLogin> users;


    public GetClientUsersResponse(Error[] errors, boolean hasError, String messages, List<ClientLogin> users) {
        super(errors, hasError, messages);
        this.users = users;

    }

    public GetClientUsersResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.users = (List<ClientLogin>) apiResponse.getResponse();

        }
    }

    
    public List<ClientLogin> getUsers() {
        return users;
    }

    public void setUsers(List<ClientLogin> users) {
        this.users = users;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetClientUsersResponse that = (GetClientUsersResponse) o;
        return Objects.equals(users, that.users) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(users);
    }

    @Override
    public String toString() {
        return "GetClientUsersResponse{" +
                 "users='" + users + '\'' +

                '}';
    }
}