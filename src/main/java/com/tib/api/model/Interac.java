
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class Interac   {

    
    /**
 * Provides a detailed explanation of the function's purpose and usage within the API.
 */
    @JsonProperty("Description")
    private String description;

    /**
 * The 'Owner' property is designed to assign and identify the ownership of a specific resource or object within the system.
 */
    @JsonProperty("Owner")
    private String owner;

    /**
 * TargetEmailAddress specifies the email address to which the Interac request is sent. It identifies the recipient for initiating an Interac transaction.
 */
    @JsonProperty("TargetEmailAddress")
    private String targetEmailAddress;

    /**
 * Specifies the mobile phone number to which the Interac request is sent.
 */
    @JsonProperty("TargetMobilePhoneNumber")
    private String targetMobilePhoneNumber;

    /**
 * The question displayed to the Interac recipient to request acceptance of a deposit.
 */
    @JsonProperty("InteracQuestion")
    private String interacQuestion;

    /**
 * InteracAnswer is the response string that the target must provide to accept an Interac deposit.
 */
    @JsonProperty("InteracAnswer")
    private String interacAnswer;


    
    public Interac() {
    }

    
    public Interac(String description, String owner, String targetEmailAddress, String targetMobilePhoneNumber, String interacQuestion, String interacAnswer) {
        this.description = description;
this.owner = owner;
this.targetEmailAddress = targetEmailAddress;
this.targetMobilePhoneNumber = targetMobilePhoneNumber;
this.interacQuestion = interacQuestion;
this.interacAnswer = interacAnswer;

    }
    
    

    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getTargetEmailAddress() {
        return targetEmailAddress;
    }

    public void setTargetEmailAddress(String targetEmailAddress) {
        this.targetEmailAddress = targetEmailAddress;
    }

    public String getTargetMobilePhoneNumber() {
        return targetMobilePhoneNumber;
    }

    public void setTargetMobilePhoneNumber(String targetMobilePhoneNumber) {
        this.targetMobilePhoneNumber = targetMobilePhoneNumber;
    }

    public String getInteracQuestion() {
        return interacQuestion;
    }

    public void setInteracQuestion(String interacQuestion) {
        this.interacQuestion = interacQuestion;
    }

    public String getInteracAnswer() {
        return interacAnswer;
    }

    public void setInteracAnswer(String interacAnswer) {
        this.interacAnswer = interacAnswer;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Interac that = (Interac) o;
        return Objects.equals(description, that.description) && Objects.equals(owner, that.owner) && Objects.equals(targetEmailAddress, that.targetEmailAddress) && Objects.equals(targetMobilePhoneNumber, that.targetMobilePhoneNumber) && Objects.equals(interacQuestion, that.interacQuestion) && Objects.equals(interacAnswer, that.interacAnswer) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(description, owner, targetEmailAddress, targetMobilePhoneNumber, interacQuestion, interacAnswer);
    }

    @Override
    public String toString() {
        return "Interac{" +
                 "description='" + description + '\'' +
 ", owner='" + owner + '\'' +
 ", targetEmailAddress='" + targetEmailAddress + '\'' +
 ", targetMobilePhoneNumber='" + targetMobilePhoneNumber + '\'' +
 ", interacQuestion='" + interacQuestion + '\'' +
 ", interacAnswer='" + interacAnswer + '\'' +

                '}';
    }
}