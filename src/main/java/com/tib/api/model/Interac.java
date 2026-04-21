
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class Interac   {

    
    /**
     * Human‑readable description of the transfer
     */
    @JsonProperty("Description")
    private String description;

    /**
     * Identifier of the entity that owns the payment method.
     */
    @JsonProperty("Owner")
    private String owner;

    /**
     * The email address of the payer to which the Interac payment request will be sent.
     */
    @JsonProperty("TargetEmailAddress")
    private String targetEmailAddress;

    /**
     * The mobile phone number of the payer to which the Interac payment will be sent
     */
    @JsonProperty("TargetMobilePhoneNumber")
    private String targetMobilePhoneNumber;

    /**
     * The security question presented to the payer for an Interac e‑Transfer payment.
     */
    @JsonProperty("InteracQuestion")
    private String interacQuestion;

    /**
     * The answer to the security question required for creating an Interac payment method.
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