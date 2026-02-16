
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


public class QuestionAnswer   {

    
    /**
     * Gets or sets the question.
     */
    @JsonProperty("Question")
    private String question;

    /**
     * Gets or sets the crypted answer.
     */
    @JsonProperty("CryptedAnswer")
    private String cryptedAnswer;


    
    public QuestionAnswer() {
    }

    
    public QuestionAnswer(String question, String cryptedAnswer) {
        this.question = question;
        this.cryptedAnswer = cryptedAnswer;
    }
    
    

    
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCryptedAnswer() {
        return cryptedAnswer;
    }

    public void setCryptedAnswer(String cryptedAnswer) {
        this.cryptedAnswer = cryptedAnswer;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuestionAnswer that = (QuestionAnswer) o;
        return Objects.equals(question, that.question) && Objects.equals(cryptedAnswer, that.cryptedAnswer) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(question, cryptedAnswer);
    }

    @Override
    public String toString() {
        return "QuestionAnswer{" +
                "question='" + question + '\'' +
                ", cryptedAnswer='" + cryptedAnswer + '\'' +

                '}';
    }
}