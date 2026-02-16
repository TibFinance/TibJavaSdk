
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.UserType;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class LoginAttempt   {

    
    /**
     * Gets or sets the type.
     */
    @JsonProperty("Type")
    private UserType type;

    /**
     * Gets or sets the attempts.
     */
    @JsonProperty("Attempts")
    private List<LocalDateTime> attempts;


    
    public LoginAttempt() {
    }

    
    public LoginAttempt(UserType type, List<LocalDateTime> attempts) {
        this.type = type;
        this.attempts = attempts;
    }
    
    

    
    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    public List<LocalDateTime> getAttempts() {
        return attempts;
    }

    public void setAttempts(List<LocalDateTime> attempts) {
        this.attempts = attempts;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoginAttempt that = (LoginAttempt) o;
        return Objects.equals(type, that.type) && Objects.equals(attempts, that.attempts) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(type, attempts);
    }

    @Override
    public String toString() {
        return "LoginAttempt{" +
                "type='" + type + '\'' +
                ", attempts='" + attempts + '\'' +

                '}';
    }
}