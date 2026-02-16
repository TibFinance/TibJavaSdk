
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.QuestionAnswer;
import com.tib.api.model.ProviderAddressEntity;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class CredentialBaseObject   {

    
    /**
     * The 'Username' property functions as a unique identifier for each user, facilitating personalized user interactions within the system.
     */
    @JsonProperty("Username")
    private String username;

    /**
     * The user's username2
     */
    @JsonProperty("Username2")
    private String username2;

    /**
     * The 'Password' property is a critical component in user authentication, safeguarding individualized user data.
     */
    @JsonProperty("Password")
    private String password;

    /**
     * Password 2
     */
    @JsonProperty("Password2")
    private String password2;

    /**
     * Gets or sets the questions.
     */
    @JsonProperty("Questions")
    private List<QuestionAnswer> questions;

    /**
     * Gets or sets the addresses.
     */
    @JsonProperty("Addresses")
    private List<ProviderAddressEntity> addresses;


    
    public CredentialBaseObject() {
    }

    
    public CredentialBaseObject(String username, String username2, String password, String password2, List<QuestionAnswer> questions, List<ProviderAddressEntity> addresses) {
        this.username = username;
        this.username2 = username2;
        this.password = password;
        this.password2 = password2;
        this.questions = questions;
        this.addresses = addresses;
    }
    
    

    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername2() {
        return username2;
    }

    public void setUsername2(String username2) {
        this.username2 = username2;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public List<QuestionAnswer> getQuestions() {
        return questions;
    }

    public void setQuestions(List<QuestionAnswer> questions) {
        this.questions = questions;
    }

    public List<ProviderAddressEntity> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<ProviderAddressEntity> addresses) {
        this.addresses = addresses;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CredentialBaseObject that = (CredentialBaseObject) o;
        return Objects.equals(username, that.username) && Objects.equals(username2, that.username2) && Objects.equals(password, that.password) && Objects.equals(password2, that.password2) && Objects.equals(questions, that.questions) && Objects.equals(addresses, that.addresses) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(username, username2, password, password2, questions, addresses);
    }

    @Override
    public String toString() {
        return "CredentialBaseObject{" +
                "username='" + username + '\'' +
                ", username2='" + username2 + '\'' +
                ", password='" + password + '\'' +
                ", password2='" + password2 + '\'' +
                ", questions='" + questions + '\'' +
                ", addresses='" + addresses + '\'' +

                '}';
    }
}